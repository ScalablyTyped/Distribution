package typings.antvUtil

import typings.antvUtil.anon.PartialPathLengthFactoryO
import typings.antvUtil.pathTypesMod.LengthFactory
import typings.antvUtil.pathTypesMod.PathArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathLengthFactoryMod {
  
  @JSImport("@antv/util/lib/path/util/path-length-factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pathLengthFactory(pathInput: String): LengthFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("pathLengthFactory")(pathInput.asInstanceOf[js.Any]).asInstanceOf[LengthFactory]
  inline def pathLengthFactory(pathInput: String, distance: Double): LengthFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("pathLengthFactory")(pathInput.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[LengthFactory]
  inline def pathLengthFactory(pathInput: String, distance: Double, options: PartialPathLengthFactoryO): LengthFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("pathLengthFactory")(pathInput.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LengthFactory]
  inline def pathLengthFactory(pathInput: String, distance: Unit, options: PartialPathLengthFactoryO): LengthFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("pathLengthFactory")(pathInput.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LengthFactory]
  inline def pathLengthFactory(pathInput: PathArray): LengthFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("pathLengthFactory")(pathInput.asInstanceOf[js.Any]).asInstanceOf[LengthFactory]
  inline def pathLengthFactory(pathInput: PathArray, distance: Double): LengthFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("pathLengthFactory")(pathInput.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[LengthFactory]
  inline def pathLengthFactory(pathInput: PathArray, distance: Double, options: PartialPathLengthFactoryO): LengthFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("pathLengthFactory")(pathInput.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LengthFactory]
  inline def pathLengthFactory(pathInput: PathArray, distance: Unit, options: PartialPathLengthFactoryO): LengthFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("pathLengthFactory")(pathInput.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LengthFactory]
}
