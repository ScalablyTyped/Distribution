package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalIntegerValueBlock
  extends ValueBlock
     with IDerConvertible {
  
  /* private */ var _valueDec: scala.Any = js.native
  
  /* protected */ def setValueHex(): Unit = js.native
  
  /**
    * @deprecated since version 3.0.0
    */
  @JSName("valueBeforeDecode")
  var valueBeforeDecode_FLocalIntegerValueBlock: js.typedarray.ArrayBuffer = js.native
  
  def valueDec: Double = js.native
  def valueDec_=(v: Double): Unit = js.native
  
  /**
    * Binary data in ArrayBuffer representation
    *
    * @deprecated since version 3.0.0
    */
  var valueHex: js.typedarray.ArrayBuffer = js.native
}
