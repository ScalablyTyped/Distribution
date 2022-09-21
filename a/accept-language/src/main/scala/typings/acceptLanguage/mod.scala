package typings.acceptLanguage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined accept-language.accept-language.AcceptLanguageModule & {  default :accept-language.accept-language.AcceptLanguageModule} */
object mod {
  
  @JSImport("accept-language", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("accept-language", "default")
  @js.native
  def default: AcceptLanguageModule = js.native
  
  /**
    * Create instance of parser
    */
  inline def create(): AcceptLanguage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[AcceptLanguage]
  
  inline def default_=(x: AcceptLanguageModule): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
    * Get matched language. If no match, the default language will be returned.
    */
  inline def get(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[String | Null]
  inline def get(priorityList: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(priorityList.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /**
    * Define your supported languages. The first language will be your default language.
    */
  inline def languages(languages: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("languages")(languages.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait AcceptLanguage extends StObject {
    
    /**
      * Get matched language. If no match, the default language will be returned.
      */
    def get(): String | Null = js.native
    def get(priorityList: String): String | Null = js.native
    
    /**
      * Define your supported languages. The first language will be your default language.
      */
    def languages(languages: js.Array[String]): Unit = js.native
  }
  
  @js.native
  trait AcceptLanguageModule
    extends StObject
       with AcceptLanguage {
    
    /**
      * Create instance of parser
      */
    def create(): AcceptLanguage = js.native
  }
}
