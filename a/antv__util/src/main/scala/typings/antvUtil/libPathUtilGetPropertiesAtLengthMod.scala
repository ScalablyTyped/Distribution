package typings.antvUtil

import typings.antvUtil.libPathTypesMod.PathArray
import typings.antvUtil.libPathTypesMod.SegmentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathUtilGetPropertiesAtLengthMod {
  
  @JSImport("@antv/util/lib/path/util/get-properties-at-length", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPropertiesAtLength(pathInput: String): SegmentProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertiesAtLength")(pathInput.asInstanceOf[js.Any]).asInstanceOf[SegmentProperties]
  inline def getPropertiesAtLength(pathInput: String, distance: Double): SegmentProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropertiesAtLength")(pathInput.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[SegmentProperties]
  inline def getPropertiesAtLength(pathInput: PathArray): SegmentProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertiesAtLength")(pathInput.asInstanceOf[js.Any]).asInstanceOf[SegmentProperties]
  inline def getPropertiesAtLength(pathInput: PathArray, distance: Double): SegmentProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropertiesAtLength")(pathInput.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[SegmentProperties]
}
