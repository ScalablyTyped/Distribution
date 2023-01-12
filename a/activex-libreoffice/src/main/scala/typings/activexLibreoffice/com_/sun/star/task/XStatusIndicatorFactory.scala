package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides multiple, probably parallel running, status indicator objects
  *
  * A possible factory is the {@link com.sun.star.frame.Frame} service.
  * @see com.sun.star.frame.Frame
  */
trait XStatusIndicatorFactory
  extends StObject
     with XInterface {
  
  /**
    * create a new status indicator instance
    * @returns the new indicator
    */
  def createStatusIndicator(): XStatusIndicator
}
object XStatusIndicatorFactory {
  
  inline def apply(
    acquire: () => Unit,
    createStatusIndicator: () => XStatusIndicator,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XStatusIndicatorFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createStatusIndicator = js.Any.fromFunction0(createStatusIndicator), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStatusIndicatorFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XStatusIndicatorFactory] (val x: Self) extends AnyVal {
    
    inline def setCreateStatusIndicator(value: () => XStatusIndicator): Self = StObject.set(x, "createStatusIndicator", js.Any.fromFunction0(value))
  }
}
