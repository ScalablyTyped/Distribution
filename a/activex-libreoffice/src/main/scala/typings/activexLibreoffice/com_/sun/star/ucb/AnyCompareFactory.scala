package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a factory to get {@link XAnyCompare} service implementations.
  * @since OOo 1.1.2
  */
@js.native
trait AnyCompareFactory extends XAnyCompareFactory {
  
  def createWithLocale(aLocale: Locale): Unit = js.native
}
object AnyCompareFactory {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createAnyCompareByName: String => XAnyCompare,
    createWithLocale: Locale => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): AnyCompareFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createAnyCompareByName = js.Any.fromFunction1(createAnyCompareByName), createWithLocale = js.Any.fromFunction1(createWithLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[AnyCompareFactory]
  }
  
  @scala.inline
  implicit class AnyCompareFactoryMutableBuilder[Self <: AnyCompareFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateWithLocale(value: Locale => Unit): Self = StObject.set(x, "createWithLocale", js.Any.fromFunction1(value))
  }
}
