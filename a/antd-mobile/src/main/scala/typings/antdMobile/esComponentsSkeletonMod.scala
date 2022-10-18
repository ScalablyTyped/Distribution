package typings.antdMobile

import typings.antdMobile.anon.PartialSkeletonProps
import typings.antdMobile.anon.WeakValidationMapSkeleton
import typings.antdMobile.esComponentsSkeletonSkeletonMod.SkeletonParagraphProps
import typings.antdMobile.esComponentsSkeletonSkeletonMod.SkeletonProps
import typings.antdMobile.esComponentsSkeletonSkeletonMod.SkeletonTitleProps
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsSkeletonMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/skeleton/skeleton.SkeletonProps> & {  Title :react.react.FC<antd-mobile.antd-mobile/es/components/skeleton/skeleton.SkeletonTitleProps>,   Paragraph :react.react.FC<antd-mobile.antd-mobile/es/components/skeleton/skeleton.SkeletonParagraphProps>} */
  object default {
    
    inline def apply(props: SkeletonProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: SkeletonProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("antd-mobile/es/components/skeleton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/skeleton", "default.Paragraph")
    @js.native
    def Paragraph: FC[SkeletonParagraphProps] = js.native
    inline def Paragraph_=(x: FC[SkeletonParagraphProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Paragraph")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/skeleton", "default.Title")
    @js.native
    def Title: FC[SkeletonTitleProps] = js.native
    inline def Title_=(x: FC[SkeletonTitleProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/skeleton", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/skeleton", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialSkeletonProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialSkeletonProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/skeleton", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/skeleton", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapSkeleton] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapSkeleton]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
