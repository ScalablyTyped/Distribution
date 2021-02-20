package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.task.XInteractionContinuation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is an interaction continuation used to hand back a new name for something.
  *
  * For example, this continuation can be selected when handling a {@link NameClashResolveRequest} in order to supply a new name for a clashing resource.
  * @author Kai Sommerfeld
  * @version 1.0
  */
@js.native
trait XInteractionSupplyName extends XInteractionContinuation {
  
  /**
    * sets the name to supply.
    * @param Name contains the name to supply.
    */
  def setName(Name: String): Unit = js.native
}
object XInteractionSupplyName {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    select: () => Unit,
    setName: String => Unit
  ): XInteractionSupplyName = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[XInteractionSupplyName]
  }
  
  @scala.inline
  implicit class XInteractionSupplyNameMutableBuilder[Self <: XInteractionSupplyName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetName(value: String => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
  }
}
