package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * the mode in which a password should be asked
  * @see PasswordRequest
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
*/
trait PasswordRequestMode extends StObject
object PasswordRequestMode {
  
  /**
    * Password creation. <P>
    *
    * The password is asked for the first time,
    *
    * so it should be entered twice.
    *
    * </P>
    */
  inline def PASSWORD_CREATE: `0` = 0.asInstanceOf[`0`]
  
  /**
    * Ask for a password. <P>
    *
    * Just ask for a password.
    *
    * </P>
    */
  inline def PASSWORD_ENTER: `1` = 1.asInstanceOf[`1`]
  
  /**
    * Wrong password was entered, ask again. <P>
    *
    * A wrong password was entered, notify user
    *
    * and ask again.
    *
    * </P>
    */
  inline def PASSWORD_REENTER: `2` = 2.asInstanceOf[`2`]
}
