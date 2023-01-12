package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositedVideoArtifactsConfiguration extends StObject {
  
  /**
    * The GridView configuration setting.
    */
  var GridViewConfiguration: typings.awsSdk.clientsChimesdkmediapipelinesMod.GridViewConfiguration
  
  /**
    * The layout setting, such as GridView in the configuration object.
    */
  var Layout: js.UndefOr[LayoutOption] = js.undefined
  
  /**
    * The video resolution setting in the configuration object. Default: HD at 1280 x 720. FHD resolution: 1920 x 1080.
    */
  var Resolution: js.UndefOr[ResolutionOption] = js.undefined
}
object CompositedVideoArtifactsConfiguration {
  
  inline def apply(GridViewConfiguration: GridViewConfiguration): CompositedVideoArtifactsConfiguration = {
    val __obj = js.Dynamic.literal(GridViewConfiguration = GridViewConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositedVideoArtifactsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompositedVideoArtifactsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setGridViewConfiguration(value: GridViewConfiguration): Self = StObject.set(x, "GridViewConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: LayoutOption): Self = StObject.set(x, "Layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "Layout", js.undefined)
    
    inline def setResolution(value: ResolutionOption): Self = StObject.set(x, "Resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "Resolution", js.undefined)
  }
}
