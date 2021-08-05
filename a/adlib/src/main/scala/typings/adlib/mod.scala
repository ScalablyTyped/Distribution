package typings.adlib

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("adlib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adlib(template: js.Any, settings: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("adlib")(template.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def adlib(template: js.Any, settings: js.Any, transforms: TransformsList): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("adlib")(template.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def listDependencies(template: js.Any): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("listDependencies")(template.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  type TransformFunction = js.Function4[
    /* key */ String, 
    /* value */ js.Any, 
    /* settings */ js.Any, 
    /* param */ js.UndefOr[js.Any], 
    js.Any
  ]
  
  type TransformsList = StringDictionary[TransformFunction]
}
