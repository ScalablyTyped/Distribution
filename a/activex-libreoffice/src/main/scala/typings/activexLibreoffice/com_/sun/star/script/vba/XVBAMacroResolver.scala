package typings.activexLibreoffice.com_.sun.star.script.vba

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Converts VBA macro names to script URLs and vice versa. */
trait XVBAMacroResolver extends js.Object {
  /**
    * Returns the VBA macro name for a macro with the passed script URL.
    * @param aScriptURL The script URL to be resolved to a VBA macro name. Must be a document-local script.
    * @returns The VBA macro name referring to a macro with the passed script URL.
    * @throws com::sun::star::lang::IllegalArgumentException if a macro with the passed name does not exist.
    */
  def resolveScriptURLtoVBAMacro(aScriptURL: String): String
  /**
    * Returns the script URL representing the passed VBA macro name.
    * @param aVBAMacroName The VBA macro name to be resolved to a script URL. The macro name may consist of up to three parts, divided by periods. The first t
    * @returns The script URL referring to the passed VBA macro.
    * @throws com::sun::star::lang::IllegalArgumentException if a macro with the passed name does not exist.
    */
  def resolveVBAMacroToScriptURL(aVBAMacroName: String): String
}

object XVBAMacroResolver {
  @scala.inline
  def apply(resolveScriptURLtoVBAMacro: String => String, resolveVBAMacroToScriptURL: String => String): XVBAMacroResolver = {
    val __obj = js.Dynamic.literal(resolveScriptURLtoVBAMacro = js.Any.fromFunction1(resolveScriptURLtoVBAMacro), resolveVBAMacroToScriptURL = js.Any.fromFunction1(resolveVBAMacroToScriptURL))
    __obj.asInstanceOf[XVBAMacroResolver]
  }
}

