package typings.antDesignProUtils

import typings.antDesignCssinjs.esHooksUseStyleRegisterMod.CSSInterpolation
import typings.antDesignCssinjs.esHooksUseStyleRegisterMod.CSSObject
import typings.antDesignProUtils.anon.HashId
import typings.antDesignProUtils.esUseStyleTokenMod.AliasToken
import typings.react.mod.ReactElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUseStyleMod {
  
  @JSImport("@ant-design/pro-utils/es/useStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lighten(baseColor: String, brightness: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(baseColor.asInstanceOf[js.Any], brightness.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def operationUnit(token: ProAliasToken): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("operationUnit")(token.asInstanceOf[js.Any]).asInstanceOf[CSSObject]
  
  inline def resetComponent(token: ProAliasToken): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("resetComponent")(token.asInstanceOf[js.Any]).asInstanceOf[CSSObject]
  
  inline def setAlpha(baseColor: String, alpha: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setAlpha")(baseColor.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def useStyle(componentName: String, styleFn: js.Function1[/* token */ ProAliasToken, CSSInterpolation]): UseStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useStyle")(componentName.asInstanceOf[js.Any], styleFn.asInstanceOf[js.Any])).asInstanceOf[UseStyleResult]
  inline def useStyle(
    componentName: String,
    styleFn: js.Function1[/* token */ ProAliasToken, CSSInterpolation],
    deps: Record[String, Any]
  ): UseStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useStyle")(componentName.asInstanceOf[js.Any], styleFn.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[UseStyleResult]
  
  /**
    * 如果 antd 里面没有，就用我 mock 的，这样 antd@4 和 antd@5 可以兼容
    */
  inline def useToken(): HashId = ^.asInstanceOf[js.Dynamic].applyDynamic("useToken")().asInstanceOf[HashId]
  
  type GenerateStyle[ComponentToken /* <: js.Object */, ReturnType] = js.Function1[/* token */ ComponentToken, ReturnType]
  
  trait ProAliasToken
    extends StObject
       with AliasToken {
    
    /**
      * antd 的 className
      * @type {string}
      * @example .ant
      */
    var antCls: String
    
    /**
      * pro 的 className
      * @type {string}
      * @example .ant-pro
      */
    var proComponentsCls: String
  }
  object ProAliasToken {
    
    inline def apply(AliasToken: AliasToken, antCls: String, proComponentsCls: String): ProAliasToken = {
      val __obj = js.Dynamic.literal(antCls = antCls.asInstanceOf[js.Any], proComponentsCls = proComponentsCls.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, AliasToken)
      __obj.asInstanceOf[ProAliasToken]
    }
    
    extension [Self <: ProAliasToken](x: Self) {
      
      inline def setAntCls(value: String): Self = StObject.set(x, "antCls", value.asInstanceOf[js.Any])
      
      inline def setProComponentsCls(value: String): Self = StObject.set(x, "proComponentsCls", value.asInstanceOf[js.Any])
    }
  }
  
  trait UseStyleResult extends StObject {
    
    var hashId: String
    
    def wrapSSR(node: ReactElement): ReactElement
  }
  object UseStyleResult {
    
    inline def apply(hashId: String, wrapSSR: ReactElement => ReactElement): UseStyleResult = {
      val __obj = js.Dynamic.literal(hashId = hashId.asInstanceOf[js.Any], wrapSSR = js.Any.fromFunction1(wrapSSR))
      __obj.asInstanceOf[UseStyleResult]
    }
    
    extension [Self <: UseStyleResult](x: Self) {
      
      inline def setHashId(value: String): Self = StObject.set(x, "hashId", value.asInstanceOf[js.Any])
      
      inline def setWrapSSR(value: ReactElement => ReactElement): Self = StObject.set(x, "wrapSSR", js.Any.fromFunction1(value))
    }
  }
}
