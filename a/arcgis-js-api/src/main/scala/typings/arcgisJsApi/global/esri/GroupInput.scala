package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.GroupInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.GroupInput")
@js.native
/**
		 * This is a read-only support class that represents a group of field inputs.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-GroupInput.html)
		 */
open class GroupInput ()
  extends StObject
     with typings.arcgisJsApi.esri.GroupInput {
  def this(properties: GroupInputProperties) = this()
  
  /**
  		 * The input's description.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputBase.html#description)
  		 */
  /* CompleteClass */
  override val description: String = js.native
}
