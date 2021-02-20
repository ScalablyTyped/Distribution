package typings.akuminaCore.mod.Digispace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppPart {
  
  @JSImport("akumina-core", "Digispace.AppPart.Data")
  @js.native
  class Data () extends StObject {
    
    var Templates: typings.akuminaCore.mod.Templates = js.native
  }
  
  @JSImport("akumina-core", "Digispace.AppPart.Eventing")
  @js.native
  class Eventing () extends StObject
  object Eventing {
    
    /* Updated */
    /* static member */
    @JSImport("akumina-core", "Digispace.AppPart.Eventing.Publish")
    @js.native
    def Publish(t: String): Unit = js.native
    @JSImport("akumina-core", "Digispace.AppPart.Eventing.Publish")
    @js.native
    def Publish(t: String, data: js.Any): Unit = js.native
    
    /* static member */
    @JSImport("akumina-core", "Digispace.AppPart.Eventing.Subscribe")
    @js.native
    def Subscribe(e: String, func: js.Any): Unit = js.native
    @JSImport("akumina-core", "Digispace.AppPart.Eventing.Subscribe")
    @js.native
    def Subscribe(e: String, func: js.Any, caller: js.Any): Unit = js.native
  }
}
