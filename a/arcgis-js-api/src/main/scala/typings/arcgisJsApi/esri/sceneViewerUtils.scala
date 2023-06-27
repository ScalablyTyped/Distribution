package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.global
import typings.arcgisJsApi.arcgisJsApiStrings.local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Note: reserved for internal use only, this is not part of the stable public API.
	 *
	 * Various utilities for the Scene Viewer application.
	 */
@js.native
trait sceneViewerUtils extends StObject {
  
  /**
  		 * Note: reserved for internal use only, this is not part of the stable public API.
  		 *
  		 * Checks for relative urls and returns whether or not this webscene allows the `saveAs()` operation.
  		 */
  def canSaveAs(webscene: WebScene): Boolean = js.native
  
  /**
  		 * Note: reserved for internal use only, this is not part of the stable public API.
  		 *
  		 * Create a new TilingScheme based on the tileInfo
  		 */
  def createTilingScheme(tileInfo: TileInfo): Any = js.native
  
  /**
  		 * Note: reserved for internal use only, this is not part of the stable public API.
  		 *
  		 * Gets whether the editor still has any pending edits which should/could prevent the widget being discarded/destroyed (e.g.
  		 */
  def editorHasPendingEdits(viewModel: EditorViewModel): Boolean = js.native
  
  /**
  		 * Note: reserved for internal use only, this is not part of the stable public API.
  		 *
  		 * Navigates back to the previous page of the `Editor` widget.
  		 */
  def editorNavigateBack(viewModel: EditorViewModel): js.Promise[scala.Unit] = js.native
  
  /**
  		 * Note: reserved for internal use only, this is not part of the stable public API.
  		 *
  		 * Generates if necessary an equivalent tileinfo but with a different pixel size (256 or 512).
  		 */
  def getOrCreateCompatibleTileInfo(tileInfo: TileInfo, expectedTileSize: Double, resolutionModifier: Double): Any = js.native
  
  /**
  		 * Note: reserved for internal use only, this is not part of the stable public API.
  		 *
  		 * Initializes all the schema validators so that validation is performed when saving web scenes or layers.
  		 */
  def initializeSchemaValidators(): scala.Unit = js.native
  
  def isHostedAgolServiceUrl(url: String): Boolean = js.native
  
  /**
  		 * Note: reserved for internal use only, this is not part of the stable public API.
  		 *
  		 * Check if the error is a schema validation error.
  		 */
  def isSchemaValidationError(saveError: scala.Unit): Boolean = js.native
  
  /**
  		 * Note: reserved for internal use only, this is not part of the stable public API.
  		 *
  		 * Checks whether the provided spatial reference is supported in the provided viewing mode.
  		 */
  def isSpatialReferenceSupported(spatialReference: SpatialReference, viewingMode: global | local): Boolean = js.native
  
  /**
  		 * Note: reserved for internal use only, this is not part of the stable public API.
  		 *
  		 * Check if a given TileInfo is supported.
  		 */
  def isSupportedTileInfo(tileInfo: TileInfo): Boolean = js.native
  
  /**
  		 * Note: reserved for internal use only, this is not part of the stable public API.
  		 *
  		 * Render svg vnode for elements provided in the descriptor
  		 */
  def renderSVG(swatch: js.Array[js.Array[Any]], width: Double, height: Double): Any = js.native
  def renderSVG(swatch: js.Array[js.Array[Any]], width: Double, height: Double, options: Any): Any = js.native
  
  /**
  		 * Note: reserved for internal use only, this is not part of the stable public API.
  		 *
  		 * Warn about problem when trying to display message about the save state.
  		 */
  def saveStateWarning(warningMessage: String, error: Any): scala.Unit = js.native
  
  /**
  		 * Note: reserved for internal use only, this is not part of the stable public API.
  		 *
  		 * Returns the start position of the cross hair while dragging to zoom.
  		 */
  def zoomDragBeginPoint(view: SceneView): js.Array[Double] | Null = js.native
}
