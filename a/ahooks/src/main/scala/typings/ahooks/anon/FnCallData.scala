package typings.ahooks.anon

import typings.std.ArrayBufferLike
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallData extends StObject {
  
  def apply(data: String): Unit = js.native
  def apply(data: js.typedarray.ArrayBufferView): Unit = js.native
  def apply(data: ArrayBufferLike): Unit = js.native
  def apply(data: Blob): Unit = js.native
}
