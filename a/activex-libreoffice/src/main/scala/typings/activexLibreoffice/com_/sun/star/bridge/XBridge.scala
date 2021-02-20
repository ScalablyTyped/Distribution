package typings.activexLibreoffice.com_.sun.star.bridge

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** main interface for an interprocess bridge. */
@js.native
trait XBridge extends XInterface {
  
  /** a unique descriptive string: protocol + ":" + XConnection.getDescription() */
  val Description: String = js.native
  
  /** name that the bridge got when it was created. */
  val Name: String = js.native
  
  /** a unique descriptive string: protocol + ":" + XConnection.getDescription() */
  def getDescription(): String = js.native
  
  /**
    * tries to get an interface from the remote that is known by this name.
    *
    * In general, this method is called once to get the initial object from the remote, but it is allowed to call the method multiple times.
    * @param sInstanceName The name of the object, that shall be retrieved from the remote process. The call is delegated to {@link com.sun.star.bridge.XInsta
    * @see com.sun.star.bridge.XInstanceProvider
    */
  def getInstance(sInstanceName: String): XInterface = js.native
  
  /** name that the bridge got when it was created. */
  def getName(): String = js.native
}
object XBridge {
  
  @scala.inline
  def apply(
    Description: String,
    Name: String,
    acquire: () => Unit,
    getDescription: () => String,
    getInstance: String => XInterface,
    getName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBridge = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDescription = js.Any.fromFunction0(getDescription), getInstance = js.Any.fromFunction1(getInstance), getName = js.Any.fromFunction0(getName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBridge]
  }
  
  @scala.inline
  implicit class XBridgeMutableBuilder[Self <: XBridge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDescription(value: () => String): Self = StObject.set(x, "getDescription", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInstance(value: String => XInterface): Self = StObject.set(x, "getInstance", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
