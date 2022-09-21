package typings.adobePdfservicesNodeSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fragmentsMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/option/documentmerge/fragments", "Fragments")
  @js.native
  open class Fragments () extends StObject {
    
    /**
      * To add JsonObject into the fragmentsList.
      */
    def addFragment(fragment: Any): Unit = js.native
    
    /**
      * To add List of JsonObject into the fragmentsList.
      */
    def addFragments(fragments: js.Array[Any]): Unit = js.native
    
    var fragmentsList: js.Array[Any] = js.native
    
    /**
      * Gets the fragmentsList.
      */
    def getFragmentsList(): js.Array[Any] = js.native
  }
}
