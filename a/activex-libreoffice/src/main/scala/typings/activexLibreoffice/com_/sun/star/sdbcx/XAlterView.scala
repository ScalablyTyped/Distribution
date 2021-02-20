package typings.activexLibreoffice.com_.sun.star.sdbcx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * implements the possibility to alter aspects of a view's definition
  * @since OOo 2.4
  */
@js.native
trait XAlterView extends StObject {
  
  /**
    * changes the command which constitutes the view
    *
    * The operation should be atomic.
    * @param NewCommand the new command which the view should be based on. Usually an `SELECT` statement.
    * @throws com::sun::star::sdbc::SQLException if an error occurs
    */
  def alterCommand(NewCommand: String): Unit = js.native
}
object XAlterView {
  
  @scala.inline
  def apply(alterCommand: String => Unit): XAlterView = {
    val __obj = js.Dynamic.literal(alterCommand = js.Any.fromFunction1(alterCommand))
    __obj.asInstanceOf[XAlterView]
  }
  
  @scala.inline
  implicit class XAlterViewMutableBuilder[Self <: XAlterView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlterCommand(value: String => Unit): Self = StObject.set(x, "alterCommand", js.Any.fromFunction1(value))
  }
}
