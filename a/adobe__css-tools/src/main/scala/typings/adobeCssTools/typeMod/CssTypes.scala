package typings.adobeCssTools.typeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CssTypes extends StObject
@JSImport("@adobe/css-tools/dist/cjs/type", "CssTypes")
@js.native
object CssTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CssTypes & String] = js.native
  
  @js.native
  sealed trait charset
    extends StObject
       with CssTypes
  /* "charset" */ val charset: typings.adobeCssTools.typeMod.CssTypes.charset & String = js.native
  
  @js.native
  sealed trait comment
    extends StObject
       with CssTypes
  /* "comment" */ val comment: typings.adobeCssTools.typeMod.CssTypes.comment & String = js.native
  
  @js.native
  sealed trait customMedia
    extends StObject
       with CssTypes
  /* "custom-media" */ val customMedia: typings.adobeCssTools.typeMod.CssTypes.customMedia & String = js.native
  
  @js.native
  sealed trait declaration
    extends StObject
       with CssTypes
  /* "declaration" */ val declaration: typings.adobeCssTools.typeMod.CssTypes.declaration & String = js.native
  
  @js.native
  sealed trait document
    extends StObject
       with CssTypes
  /* "document" */ val document: typings.adobeCssTools.typeMod.CssTypes.document & String = js.native
  
  @js.native
  sealed trait fontFace
    extends StObject
       with CssTypes
  /* "font-face" */ val fontFace: typings.adobeCssTools.typeMod.CssTypes.fontFace & String = js.native
  
  @js.native
  sealed trait host
    extends StObject
       with CssTypes
  /* "host" */ val host: typings.adobeCssTools.typeMod.CssTypes.host & String = js.native
  
  @js.native
  sealed trait `import`
    extends StObject
       with CssTypes
  /* "import" */ val `import`: typings.adobeCssTools.typeMod.CssTypes.`import` & String = js.native
  
  @js.native
  sealed trait keyframe
    extends StObject
       with CssTypes
  /* "keyframe" */ val keyframe: typings.adobeCssTools.typeMod.CssTypes.keyframe & String = js.native
  
  @js.native
  sealed trait keyframes
    extends StObject
       with CssTypes
  /* "keyframes" */ val keyframes: typings.adobeCssTools.typeMod.CssTypes.keyframes & String = js.native
  
  @js.native
  sealed trait media
    extends StObject
       with CssTypes
  /* "media" */ val media: typings.adobeCssTools.typeMod.CssTypes.media & String = js.native
  
  @js.native
  sealed trait namespace
    extends StObject
       with CssTypes
  /* "namespace" */ val namespace: typings.adobeCssTools.typeMod.CssTypes.namespace & String = js.native
  
  @js.native
  sealed trait page
    extends StObject
       with CssTypes
  /* "page" */ val page: typings.adobeCssTools.typeMod.CssTypes.page & String = js.native
  
  @js.native
  sealed trait rule
    extends StObject
       with CssTypes
  /* "rule" */ val rule: typings.adobeCssTools.typeMod.CssTypes.rule & String = js.native
  
  @js.native
  sealed trait stylesheet
    extends StObject
       with CssTypes
  /* "stylesheet" */ val stylesheet: typings.adobeCssTools.typeMod.CssTypes.stylesheet & String = js.native
  
  @js.native
  sealed trait supports
    extends StObject
       with CssTypes
  /* "supports" */ val supports: typings.adobeCssTools.typeMod.CssTypes.supports & String = js.native
}
