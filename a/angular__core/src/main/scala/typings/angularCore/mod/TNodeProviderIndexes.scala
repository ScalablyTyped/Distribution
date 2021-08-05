package typings.angularCore.mod

import typings.angularCore.angularCoreNumbers.`1048575`
import typings.angularCore.angularCoreNumbers.`1048576`
import typings.angularCore.angularCoreNumbers.`20`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Corresponds to the TNode.providerIndexes property.
  */
/* Rewritten from type alias, can be one of: 
  - typings.angularCore.angularCoreNumbers.`1048575`
  - typings.angularCore.angularCoreNumbers.`20`
  - typings.angularCore.angularCoreNumbers.`1048576`
*/
trait TNodeProviderIndexes extends StObject
object TNodeProviderIndexes {
  
  /**
    * The count of view providers from the component on this node is
    * encoded on the 20 most significant bits.
    */
  inline def CptViewProvidersCountShift: `20` = 20.asInstanceOf[`20`]
  
  inline def CptViewProvidersCountShifter: `1048576` = 1048576.asInstanceOf[`1048576`]
  
  /** The index of the first provider on this node is encoded on the least significant bits. */
  inline def ProvidersStartIndexMask: `1048575` = 1048575.asInstanceOf[`1048575`]
}
