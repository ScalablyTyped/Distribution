package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "LocalHexBlock")
@js.native
class LocalHexBlock protected ()
  extends StObject
     with ILocalHexBlock {
  def this(params: js.Any) = this()
}
object LocalHexBlock {
  
  @JSImport("asn1js", "LocalHexBlock")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Aux function, need to get a block name. Need to have it here for inhiritence
    * 
    * @static
    * @returns {string}
    * 
    * @memberOf LocalHexBlockMixin
    */
  /* static member */
  inline def blockName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("blockName")().asInstanceOf[String]
}
