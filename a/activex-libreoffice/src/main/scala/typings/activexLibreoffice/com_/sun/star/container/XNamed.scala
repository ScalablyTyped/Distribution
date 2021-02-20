package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the name of the object.
  *
  * The name is generally unique in the container of the object.
  */
@js.native
trait XNamed extends XInterface {
  
  /** @returns the programmatic name of the object. */
  var Name: String = js.native
  
  /** @returns the programmatic name of the object. */
  def getName(): String = js.native
  
  /** sets the programmatic name of the object. */
  def setName(aName: String): Unit = js.native
}
object XNamed {
  
  @scala.inline
  def apply(
    Name: String,
    acquire: () => Unit,
    getName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setName: String => Unit
  ): XNamed = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getName = js.Any.fromFunction0(getName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[XNamed]
  }
  
  @scala.inline
  implicit class XNamedMutableBuilder[Self <: XNamed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetName(value: String => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
  }
}
