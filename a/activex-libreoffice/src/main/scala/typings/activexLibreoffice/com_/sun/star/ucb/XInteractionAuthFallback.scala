package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.task.XInteractionContinuation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interaction continuation specifying authentication success.
  * @since LibreOffice 4.4
  */
trait XInteractionAuthFallback
  extends StObject
     with XInteractionContinuation {
  
  def setCode(code: String): Unit
}
object XInteractionAuthFallback {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    select: () => Unit,
    setCode: String => Unit
  ): XInteractionAuthFallback = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setCode = js.Any.fromFunction1(setCode))
    __obj.asInstanceOf[XInteractionAuthFallback]
  }
  
  extension [Self <: XInteractionAuthFallback](x: Self) {
    
    inline def setSetCode(value: String => Unit): Self = StObject.set(x, "setCode", js.Any.fromFunction1(value))
  }
}
