package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uploadInterfaceMod {
  type HttpRequestHeader = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type PreviewFileHandler = js.Function1[/* file */ typings.std.File | typings.std.Blob, js.Thenable[java.lang.String]]
  type TransformFileHandler = js.Function1[
    /* file */ typings.antd.uploadInterfaceMod.RcFile, 
    java.lang.String | typings.std.Blob | typings.std.File | (js.Thenable[java.lang.String | typings.std.Blob | typings.std.File])
  ]
}
