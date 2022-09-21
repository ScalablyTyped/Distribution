package typings.akuminaCore.mod.Digispace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppPart {
  
  @JSImport("akumina-core", "Digispace.AppPart.Data")
  @js.native
  open class Data () extends StObject {
    
    var Templates: typings.akuminaCore.mod.Templates = js.native
  }
  
  @JSImport("akumina-core", "Digispace.AppPart.Eventing")
  @js.native
  open class Eventing () extends StObject
  object Eventing {
    
    @JSImport("akumina-core", "Digispace.AppPart.Eventing")
    @js.native
    val ^ : js.Any = js.native
    
    /* Updated */
    /* static member */
    inline def ClearSubscribedAndPublished(e: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearSubscribedAndPublished")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* Updated */
    /* static member */
    inline def Publish(t: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Publish")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def Publish(t: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Publish")(t.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def ResetTrackedEvents(widgetsOnPage: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ResetTrackedEvents")(widgetsOnPage.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def Subscribe(e: String, func: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Subscribe")(e.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def Subscribe(e: String, func: Any, caller: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Subscribe")(e.asInstanceOf[js.Any], func.asInstanceOf[js.Any], caller.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* Updated */
    /* static member */
    inline def UnSubscribe(e: String, func: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UnSubscribe")(e.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def UnSubscribe(e: String, func: Any, caller: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UnSubscribe")(e.asInstanceOf[js.Any], func.asInstanceOf[js.Any], caller.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
