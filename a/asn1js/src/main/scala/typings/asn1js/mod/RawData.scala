package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Special class providing ability to have "toBER/fromBER" for raw ArrayBuffer
  */
@JSImport("asn1js", "RawData")
@js.native
open class RawData ()
  extends StObject
     with IBerConvertible {
  def this(param0: RawDataParams) = this()
  
  /**
    * @deprecated Since v3.0.0
    */
  def data: js.typedarray.ArrayBuffer = js.native
  
  /**
    * @since 3.0.0
    */
  var dataView: js.typedarray.Uint8Array = js.native
  
  /**
    * @deprecated Since v3.0.0
    */
  def data_=(value: js.typedarray.ArrayBuffer): Unit = js.native
}
