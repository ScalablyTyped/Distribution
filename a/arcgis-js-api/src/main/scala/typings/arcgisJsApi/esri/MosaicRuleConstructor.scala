package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MosaicRuleConstructor
  extends StObject
     with /**
  * Specifies the mosaic rule when defining how individual images should be mosaicked.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html)
  */
Instantiable0[MosaicRule]
     with Instantiable1[/* properties */ MosaicRuleProperties, MosaicRule] {
  
  def fromJSON(json: Any): MosaicRule = js.native
}
