package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to change the settings of a DDE link.
  * @deprecated Deprecated
  * @see com.sun.star.sheet.DDELink
  */
trait XDDELink
  extends StObject
     with XInterface {
  
  /** returns the application from which data are requested (the DDE server application). */
  val Application: String
  
  /** returns the DDE item from which data are requested. */
  val Item: String
  
  /** returns the DDE topic from which data are requested. */
  val Topic: String
  
  /** returns the application from which data are requested (the DDE server application). */
  def getApplication(): String
  
  /** returns the DDE item from which data are requested. */
  def getItem(): String
  
  /** returns the DDE topic from which data are requested. */
  def getTopic(): String
}
object XDDELink {
  
  inline def apply(
    Application: String,
    Item: String,
    Topic: String,
    acquire: () => Unit,
    getApplication: () => String,
    getItem: () => String,
    getTopic: () => String,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XDDELink = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Topic = Topic.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getApplication = js.Any.fromFunction0(getApplication), getItem = js.Any.fromFunction0(getItem), getTopic = js.Any.fromFunction0(getTopic), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDDELink]
  }
  
  extension [Self <: XDDELink](x: Self) {
    
    inline def setApplication(value: String): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setGetApplication(value: () => String): Self = StObject.set(x, "getApplication", js.Any.fromFunction0(value))
    
    inline def setGetItem(value: () => String): Self = StObject.set(x, "getItem", js.Any.fromFunction0(value))
    
    inline def setGetTopic(value: () => String): Self = StObject.set(x, "getTopic", js.Any.fromFunction0(value))
    
    inline def setItem(value: String): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: String): Self = StObject.set(x, "Topic", value.asInstanceOf[js.Any])
  }
}
