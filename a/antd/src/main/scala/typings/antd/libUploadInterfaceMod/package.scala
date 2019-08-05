package typings.antd

import org.scalablytyped.runtime.StringDictionary
import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUploadInterfaceMod {
  type HttpRequestHeader = StringDictionary[String]
  type PreviewFileHandler = js.Function1[/* file */ File | Blob, js.Thenable[String]]
  type TransformFileHandler = js.Function1[/* file */ UploadFile, String | Blob | File | (js.Thenable[String | Blob | File])]
}
