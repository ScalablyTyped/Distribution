package typings.antDesignPro

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.antDesignPro.anon.TypeofAuthorized
import typings.antDesignPro.anon.TypeofTagSelectOption
import typings.antDesignPro.avatarItemMod.AvatarItemProps
import typings.antDesignPro.avatarListMod.default
import typings.antDesignPro.loginItemMod.LoginItemProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ant-design-pro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Authorized(currentAuthority: String): TypeofAuthorized = ^.asInstanceOf[js.Dynamic].applyDynamic("Authorized")(currentAuthority.asInstanceOf[js.Any]).asInstanceOf[TypeofAuthorized]
  
  @JSImport("ant-design-pro", "AvatarList")
  @js.native
  class AvatarList () extends default
  /* static members */
  object AvatarList {
    
    @JSImport("ant-design-pro", "AvatarList")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro", "AvatarList.Item")
    @js.native
    def Item: Instantiable1[/* props */ AvatarItemProps, typings.antDesignPro.avatarItemMod.default] = js.native
    inline def Item_=(x: Instantiable1[/* props */ AvatarItemProps, typings.antDesignPro.avatarItemMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ant-design-pro", "CountDown")
  @js.native
  class CountDown ()
    extends typings.antDesignPro.countDownMod.default
  
  @JSImport("ant-design-pro", "DescriptionList")
  @js.native
  class DescriptionList ()
    extends typings.antDesignPro.descriptionListMod.default
  /* static members */
  object DescriptionList {
    
    @JSImport("ant-design-pro", "DescriptionList")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro", "DescriptionList.Description")
    @js.native
    def Description: Instantiable0[typings.antDesignPro.descriptionMod.default] = js.native
    inline def Description_=(x: Instantiable0[typings.antDesignPro.descriptionMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Description")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ant-design-pro", "Ellipsis")
  @js.native
  class Ellipsis ()
    extends typings.antDesignPro.ellipsisMod.default
  
  @JSImport("ant-design-pro", "Exception")
  @js.native
  class Exception ()
    extends typings.antDesignPro.exceptionMod.default
  
  @JSImport("ant-design-pro", "FooterToolbar")
  @js.native
  class FooterToolbar ()
    extends typings.antDesignPro.footerToolbarMod.default
  
  @JSImport("ant-design-pro", "GlobalFooter")
  @js.native
  class GlobalFooter ()
    extends typings.antDesignPro.globalFooterMod.default
  
  @JSImport("ant-design-pro", "HeaderDropdown")
  @js.native
  class HeaderDropdown ()
    extends typings.antDesignPro.headerDropdownMod.default
  
  @JSImport("ant-design-pro", "HeaderSearch")
  @js.native
  class HeaderSearch ()
    extends typings.antDesignPro.headerSearchMod.default
  
  @JSImport("ant-design-pro", "Login")
  @js.native
  class Login ()
    extends typings.antDesignPro.loginMod.default
  object Login {
    
    @JSImport("ant-design-pro", "Login")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("ant-design-pro", "Login.Captcha")
    @js.native
    def Captcha: FC[LoginItemProps] = js.native
    inline def Captcha_=(x: FC[LoginItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Captcha")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("ant-design-pro", "Login.Mobile")
    @js.native
    def Mobile: FC[LoginItemProps] = js.native
    inline def Mobile_=(x: FC[LoginItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Mobile")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("ant-design-pro", "Login.Password")
    @js.native
    def Password: FC[LoginItemProps] = js.native
    inline def Password_=(x: FC[LoginItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Password")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("ant-design-pro", "Login.Submit")
    @js.native
    def Submit: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof LoginSubmit */ js.Any = js.native
    inline def Submit_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof LoginSubmit */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Submit")(x.asInstanceOf[js.Any])
    
    /* was `typeof LoginTab` */
    @JSImport("ant-design-pro", "Login.Tab")
    @js.native
    class Tab ()
      extends typings.antDesignPro.loginMod.default.Tab
    
    /* static member */
    @JSImport("ant-design-pro", "Login.UserName")
    @js.native
    def UserName: FC[LoginItemProps] = js.native
    inline def UserName_=(x: FC[LoginItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UserName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ant-design-pro", "NoticeIcon")
  @js.native
  class NoticeIcon ()
    extends typings.antDesignPro.noticeIconMod.default
  /* static members */
  object NoticeIcon {
    
    @JSImport("ant-design-pro", "NoticeIcon")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro", "NoticeIcon.Tab")
    @js.native
    def Tab: Instantiable0[typings.antDesignPro.noticeIconTabMod.default] = js.native
    inline def Tab_=(x: Instantiable0[typings.antDesignPro.noticeIconTabMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tab")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ant-design-pro", "NumberInfo")
  @js.native
  class NumberInfo ()
    extends typings.antDesignPro.numberInfoMod.default
  
  @JSImport("ant-design-pro", "PageHeader")
  @js.native
  class PageHeader ()
    extends typings.antDesignPro.pageHeaderMod.default
  
  @JSImport("ant-design-pro", "Result")
  @js.native
  class Result ()
    extends typings.antDesignPro.resultMod.default
  
  @JSImport("ant-design-pro", "TagSelect")
  @js.native
  class TagSelect ()
    extends typings.antDesignPro.tagSelectMod.default
  /* static members */
  object TagSelect {
    
    @JSImport("ant-design-pro", "TagSelect")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro", "TagSelect.Option")
    @js.native
    def Option: TypeofTagSelectOption = js.native
    inline def Option_=(x: TypeofTagSelectOption): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Option")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ant-design-pro", "Trend")
  @js.native
  class Trend ()
    extends typings.antDesignPro.trendMod.default
}
