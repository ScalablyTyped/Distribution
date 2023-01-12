package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Script Module containing some scripting code in a certain scripting language
  * @deprecated Deprecated
  */
trait XStarBasicModuleInfo
  extends StObject
     with XInterface {
  
  /** returns the type of the script language as string, for example, "StarBasic" or "JavaScript". */
  val Language: String
  
  /** returns the name of the module */
  val Name: String
  
  /**
    * returns the script source code as string.
    *
    * The code has to correspond with the language defined by Language.
    */
  val Source: String
  
  /** returns the type of the script language as string, for example, "StarBasic" or "JavaScript". */
  def getLanguage(): String
  
  /** returns the name of the module */
  def getName(): String
  
  /**
    * returns the script source code as string.
    *
    * The code has to correspond with the language defined by Language.
    */
  def getSource(): String
}
object XStarBasicModuleInfo {
  
  inline def apply(
    Language: String,
    Name: String,
    Source: String,
    acquire: () => Unit,
    getLanguage: () => String,
    getName: () => String,
    getSource: () => String,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XStarBasicModuleInfo = {
    val __obj = js.Dynamic.literal(Language = Language.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLanguage = js.Any.fromFunction0(getLanguage), getName = js.Any.fromFunction0(getName), getSource = js.Any.fromFunction0(getSource), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStarBasicModuleInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XStarBasicModuleInfo] (val x: Self) extends AnyVal {
    
    inline def setGetLanguage(value: () => String): Self = StObject.set(x, "getLanguage", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetSource(value: () => String): Self = StObject.set(x, "getSource", js.Any.fromFunction0(value))
    
    inline def setLanguage(value: String): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
  }
}
