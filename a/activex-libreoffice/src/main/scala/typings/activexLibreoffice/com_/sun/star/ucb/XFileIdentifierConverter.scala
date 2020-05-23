package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies methods to convert between (file) URLs and file paths in system dependent notation.
  * @author Andreas Bille
  * @version 1.0
  */
trait XFileIdentifierConverter extends XInterface {
  /**
    * Get information about the "locality" of a file content provider.
    *
    * The returned information can be used to chose the "best" among a number of file content providers implementing this interface.
    * @param BaseURL the base (file) URL used to specify a file content provider.
    * @returns an appropriate value representing the "locality" of the specified file content provider. Generally, higher (non-negative) numbers denote file con
    */
  def getFileProviderLocality(BaseURL: String): Double
  /**
    * converts a file path in system dependent notation to a (file) URL.
    * @param BaseURL the base (file) URL relative to which the file path shall be interpreted.
    * @param SystemPath a file path in system dependent notation.
    * @returns the URL corresponding to the file path, or an empty string if the file path cannot be converted into a URL.
    */
  def getFileURLFromSystemPath(BaseURL: String, SystemPath: String): String
  /**
    * converts a (file) URL to a file path in system dependent notation.
    * @param URL a (file) URL.
    * @returns the file path corresponding to the URL, or an empty string if the URL cannot be converted into a file path.
    */
  def getSystemPathFromFileURL(URL: String): String
}

object XFileIdentifierConverter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getFileProviderLocality: String => Double,
    getFileURLFromSystemPath: (String, String) => String,
    getSystemPathFromFileURL: String => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFileIdentifierConverter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getFileProviderLocality = js.Any.fromFunction1(getFileProviderLocality), getFileURLFromSystemPath = js.Any.fromFunction2(getFileURLFromSystemPath), getSystemPathFromFileURL = js.Any.fromFunction1(getSystemPathFromFileURL), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFileIdentifierConverter]
  }
}

