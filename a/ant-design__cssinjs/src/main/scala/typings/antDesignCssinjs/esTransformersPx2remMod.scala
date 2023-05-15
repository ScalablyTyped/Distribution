package typings.antDesignCssinjs

import typings.antDesignCssinjs.esTransformersInterfaceMod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTransformersPx2remMod {
  
  @JSImport("@ant-design/cssinjs/es/transformers/px2rem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Transformer]
  inline def default(options: Options): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Transformer]
  
  trait Options extends StObject {
    
    /**
      * Whether to allow px to be converted in media queries.
      * @default false
      */
    var mediaQuery: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The decimal numbers to allow the REM units to grow to.
      * @default 5
      */
    var precision: js.UndefOr[Double] = js.undefined
    
    /**
      * The root font size.
      * @default 16
      */
    var rootValue: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setMediaQuery(value: Boolean): Self = StObject.set(x, "mediaQuery", value.asInstanceOf[js.Any])
      
      inline def setMediaQueryUndefined: Self = StObject.set(x, "mediaQuery", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setRootValue(value: Double): Self = StObject.set(x, "rootValue", value.asInstanceOf[js.Any])
      
      inline def setRootValueUndefined: Self = StObject.set(x, "rootValue", js.undefined)
    }
  }
}
