package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "ViewWriter")
@js.native
open class ViewWriter () extends StObject {
  
  /**
    * Concatenates all buffers
    * @returns Concatenated buffer
    */
  def `final`(): js.typedarray.ArrayBuffer = js.native
  
  var items: js.Array[js.typedarray.ArrayBuffer] = js.native
  
  /**
    * Writes buffer
    * @param buf
    */
  def write(buf: js.typedarray.ArrayBuffer): Unit = js.native
}
