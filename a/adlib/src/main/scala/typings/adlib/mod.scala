package typings.adlib

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("adlib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adlib(template: Any, settings: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("adlib")(template.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def adlib(template: Any, settings: Any, transforms: TransformsList): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("adlib")(template.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def listDependencies(template: Any): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("listDependencies")(template.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  type TransformFunction = js.Function4[/* key */ String, /* value */ Any, /* settings */ Any, /* param */ js.UndefOr[Any], Any]
  
  type TransformsList = StringDictionary[TransformFunction]
}
