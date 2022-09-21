package typings.agiledigitalMulePreview

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@agiledigital/mule-preview", "MulePreviewContent")
  @js.native
  val MulePreviewContent: FC[MulePreviewContentProps] = js.native
  
  @JSImport("@agiledigital/mule-preview", "MulePreviewDiffContent")
  @js.native
  val MulePreviewDiffContent: FC[MulePreviewDiffContentProps] = js.native
  
  @JSImport("@agiledigital/mule-preview", "MulePreviewDiffUrl")
  @js.native
  val MulePreviewDiffUrl: FC[MulePreviewDiffUrlProps] = js.native
  
  @JSImport("@agiledigital/mule-preview", "MulePreviewUrl")
  @js.native
  val MulePreviewUrl: FC[MulePreviewUrlProps] = js.native
  
  trait MulePreviewContentProps extends StObject {
    
    val contentRoot: String
    
    val contentString: String
  }
  object MulePreviewContentProps {
    
    inline def apply(contentRoot: String, contentString: String): MulePreviewContentProps = {
      val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentString = contentString.asInstanceOf[js.Any])
      __obj.asInstanceOf[MulePreviewContentProps]
    }
    
    extension [Self <: MulePreviewContentProps](x: Self) {
      
      inline def setContentRoot(value: String): Self = StObject.set(x, "contentRoot", value.asInstanceOf[js.Any])
      
      inline def setContentString(value: String): Self = StObject.set(x, "contentString", value.asInstanceOf[js.Any])
    }
  }
  
  trait MulePreviewDiffContentProps extends StObject {
    
    val contentRoot: String
    
    val contentStrings: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]
  }
  object MulePreviewDiffContentProps {
    
    inline def apply(contentRoot: String, contentStrings: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): MulePreviewDiffContentProps = {
      val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentStrings = contentStrings.asInstanceOf[js.Any])
      __obj.asInstanceOf[MulePreviewDiffContentProps]
    }
    
    extension [Self <: MulePreviewDiffContentProps](x: Self) {
      
      inline def setContentRoot(value: String): Self = StObject.set(x, "contentRoot", value.asInstanceOf[js.Any])
      
      inline def setContentStrings(value: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): Self = StObject.set(x, "contentStrings", value.asInstanceOf[js.Any])
    }
  }
  
  trait MulePreviewDiffUrlProps extends StObject {
    
    val contentRoot: String
    
    val contentUrls: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]
  }
  object MulePreviewDiffUrlProps {
    
    inline def apply(contentRoot: String, contentUrls: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): MulePreviewDiffUrlProps = {
      val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentUrls = contentUrls.asInstanceOf[js.Any])
      __obj.asInstanceOf[MulePreviewDiffUrlProps]
    }
    
    extension [Self <: MulePreviewDiffUrlProps](x: Self) {
      
      inline def setContentRoot(value: String): Self = StObject.set(x, "contentRoot", value.asInstanceOf[js.Any])
      
      inline def setContentUrls(value: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): Self = StObject.set(x, "contentUrls", value.asInstanceOf[js.Any])
    }
  }
  
  trait MulePreviewUrlProps extends StObject {
    
    val contentRoot: String
    
    val contentUrl: String
  }
  object MulePreviewUrlProps {
    
    inline def apply(contentRoot: String, contentUrl: String): MulePreviewUrlProps = {
      val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentUrl = contentUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[MulePreviewUrlProps]
    }
    
    extension [Self <: MulePreviewUrlProps](x: Self) {
      
      inline def setContentRoot(value: String): Self = StObject.set(x, "contentRoot", value.asInstanceOf[js.Any])
      
      inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    }
  }
}
