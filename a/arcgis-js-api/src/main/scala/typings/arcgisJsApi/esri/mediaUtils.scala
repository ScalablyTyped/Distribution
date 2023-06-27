package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Note: reserved for internal use only, this is not part of the stable public API.
	 *
	 * Media layer utilities for the map viewer application.
	 */
@js.native
trait mediaUtils extends StObject {
  
  /**
  		 * Note: reserved for internal use only, this is not part of the stable public API.
  		 *
  		 * Creates a georeference for a media element and a view extent.
  		 */
  def createDefaultControlPointsGeoreference(mediaElement: ImageElement, extent: Extent): js.Promise[ControlPointsGeoreference] = js.native
  def createDefaultControlPointsGeoreference(mediaElement: VideoElement, extent: Extent): js.Promise[ControlPointsGeoreference] = js.native
  
  /**
  		 * Note: reserved for internal use only, this is not part of the stable public API.
  		 *
  		 * Creates a georeference to be used in a MapView when authoring the source points of the element's georeference.
  		 */
  def createLocalModeControlPointsGeoreference(mediaElement: ImageElement): ControlPointsGeoreference | Null = js.native
  def createLocalModeControlPointsGeoreference(mediaElement: VideoElement): ControlPointsGeoreference | Null = js.native
}
