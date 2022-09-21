package typings.antDesignCssinjs

import typings.antDesignCssinjs.interfaceMod.DerivativeFunc
import typings.antDesignCssinjs.interfaceMod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeThemeMod {
  
  @JSImport("@ant-design/cssinjs/es/theme/Theme", JSImport.Default)
  @js.native
  open class default[DesignToken /* <: TokenType */, DerivativeToken /* <: TokenType */] protected ()
    extends StObject
       with Theme[DesignToken, DerivativeToken] {
    def this(derivatives: js.Array[DerivativeFunc[DesignToken, DerivativeToken]]) = this()
    def this(derivatives: DerivativeFunc[DesignToken, DerivativeToken]) = this()
    
    /* private */ /* CompleteClass */
    var derivatives: Any = js.native
    
    /* CompleteClass */
    override def getDerivativeToken(token: DesignToken): DerivativeToken = js.native
    
    /* CompleteClass */
    override val id: Double = js.native
  }
  
  trait Theme[DesignToken /* <: TokenType */, DerivativeToken /* <: TokenType */] extends StObject {
    
    /* private */ var derivatives: Any
    
    def getDerivativeToken(token: DesignToken): DerivativeToken
    
    val id: Double
  }
  object Theme {
    
    inline def apply[DesignToken /* <: TokenType */, DerivativeToken /* <: TokenType */](derivatives: Any, getDerivativeToken: DesignToken => DerivativeToken, id: Double): Theme[DesignToken, DerivativeToken] = {
      val __obj = js.Dynamic.literal(derivatives = derivatives.asInstanceOf[js.Any], getDerivativeToken = js.Any.fromFunction1(getDerivativeToken), id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme[DesignToken, DerivativeToken]]
    }
    
    extension [Self <: Theme[?, ?], DesignToken /* <: TokenType */, DerivativeToken /* <: TokenType */](x: Self & (Theme[DesignToken, DerivativeToken])) {
      
      inline def setDerivatives(value: Any): Self = StObject.set(x, "derivatives", value.asInstanceOf[js.Any])
      
      inline def setGetDerivativeToken(value: DesignToken => DerivativeToken): Self = StObject.set(x, "getDerivativeToken", js.Any.fromFunction1(value))
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
