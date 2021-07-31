package typings.agiledigitalMulePreview

import typings.react.mod.SFC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@agiledigital/mule-preview", "MulePreviewContent")
  @js.native
  val MulePreviewContent: SFC[MulePreviewContentProps] = js.native
  
  @JSImport("@agiledigital/mule-preview", "MulePreviewDiffContent")
  @js.native
  val MulePreviewDiffContent: SFC[MulePreviewDiffContentProps] = js.native
  
  @JSImport("@agiledigital/mule-preview", "MulePreviewDiffUrl")
  @js.native
  val MulePreviewDiffUrl: SFC[MulePreviewDiffUrlProps] = js.native
  
  @JSImport("@agiledigital/mule-preview", "MulePreviewUrl")
  @js.native
  val MulePreviewUrl: SFC[MulePreviewUrlProps] = js.native
  
  trait MulePreviewContentProps extends StObject {
    
    val contentRoot: String
    
    val contentString: String
  }
  object MulePreviewContentProps {
    
    @scala.inline
    def apply(contentRoot: String, contentString: String): MulePreviewContentProps = {
      val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentString = contentString.asInstanceOf[js.Any])
      __obj.asInstanceOf[MulePreviewContentProps]
    }
    
    @scala.inline
    implicit class MulePreviewContentPropsMutableBuilder[Self <: MulePreviewContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentRoot(value: String): Self = StObject.set(x, "contentRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentString(value: String): Self = StObject.set(x, "contentString", value.asInstanceOf[js.Any])
    }
  }
  
  trait MulePreviewDiffContentProps extends StObject {
    
    val contentRoot: String
    
    val contentStrings: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]
  }
  object MulePreviewDiffContentProps {
    
    @scala.inline
    def apply(contentRoot: String, contentStrings: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): MulePreviewDiffContentProps = {
      val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentStrings = contentStrings.asInstanceOf[js.Any])
      __obj.asInstanceOf[MulePreviewDiffContentProps]
    }
    
    @scala.inline
    implicit class MulePreviewDiffContentPropsMutableBuilder[Self <: MulePreviewDiffContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentRoot(value: String): Self = StObject.set(x, "contentRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStrings(value: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): Self = StObject.set(x, "contentStrings", value.asInstanceOf[js.Any])
    }
  }
  
  trait MulePreviewDiffUrlProps extends StObject {
    
    val contentRoot: String
    
    val contentUrls: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]
  }
  object MulePreviewDiffUrlProps {
    
    @scala.inline
    def apply(contentRoot: String, contentUrls: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): MulePreviewDiffUrlProps = {
      val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentUrls = contentUrls.asInstanceOf[js.Any])
      __obj.asInstanceOf[MulePreviewDiffUrlProps]
    }
    
    @scala.inline
    implicit class MulePreviewDiffUrlPropsMutableBuilder[Self <: MulePreviewDiffUrlProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentRoot(value: String): Self = StObject.set(x, "contentRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUrls(value: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): Self = StObject.set(x, "contentUrls", value.asInstanceOf[js.Any])
    }
  }
  
  trait MulePreviewUrlProps extends StObject {
    
    val contentRoot: String
    
    val contentUrl: String
  }
  object MulePreviewUrlProps {
    
    @scala.inline
    def apply(contentRoot: String, contentUrl: String): MulePreviewUrlProps = {
      val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentUrl = contentUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[MulePreviewUrlProps]
    }
    
    @scala.inline
    implicit class MulePreviewUrlPropsMutableBuilder[Self <: MulePreviewUrlProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentRoot(value: String): Self = StObject.set(x, "contentRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    }
  }
}
