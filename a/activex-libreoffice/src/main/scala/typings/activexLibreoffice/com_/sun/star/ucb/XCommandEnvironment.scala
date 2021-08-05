package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defines the environment for a command.
  * @author Kai Sommerfeld
  * @see XCommandProcessor
  * @version 1.0
  */
trait XCommandEnvironment
  extends StObject
     with XInterface {
  
  /**
    * returns the command's interaction handler.
    *
    * If called multiple times, this method should consistently return the same value (to allow caching).
    * @returns an interaction handler
    */
  val InteractionHandler: XInteractionHandler
  
  /**
    * returns the command's progress handler.
    *
    * If called multiple times, this method should consistently return the same value (to allow caching).
    * @returns a progress handler
    */
  val ProgressHandler: XProgressHandler
  
  /**
    * returns the command's interaction handler.
    *
    * If called multiple times, this method should consistently return the same value (to allow caching).
    * @returns an interaction handler
    */
  def getInteractionHandler(): XInteractionHandler
  
  /**
    * returns the command's progress handler.
    *
    * If called multiple times, this method should consistently return the same value (to allow caching).
    * @returns a progress handler
    */
  def getProgressHandler(): XProgressHandler
}
object XCommandEnvironment {
  
  inline def apply(
    InteractionHandler: XInteractionHandler,
    ProgressHandler: XProgressHandler,
    acquire: () => Unit,
    getInteractionHandler: () => XInteractionHandler,
    getProgressHandler: () => XProgressHandler,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCommandEnvironment = {
    val __obj = js.Dynamic.literal(InteractionHandler = InteractionHandler.asInstanceOf[js.Any], ProgressHandler = ProgressHandler.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getInteractionHandler = js.Any.fromFunction0(getInteractionHandler), getProgressHandler = js.Any.fromFunction0(getProgressHandler), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCommandEnvironment]
  }
  
  extension [Self <: XCommandEnvironment](x: Self) {
    
    inline def setGetInteractionHandler(value: () => XInteractionHandler): Self = StObject.set(x, "getInteractionHandler", js.Any.fromFunction0(value))
    
    inline def setGetProgressHandler(value: () => XProgressHandler): Self = StObject.set(x, "getProgressHandler", js.Any.fromFunction0(value))
    
    inline def setInteractionHandler(value: XInteractionHandler): Self = StObject.set(x, "InteractionHandler", value.asInstanceOf[js.Any])
    
    inline def setProgressHandler(value: XProgressHandler): Self = StObject.set(x, "ProgressHandler", value.asInstanceOf[js.Any])
  }
}
