package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * supports parsing and assembling of URLs
  * @see URL
  * @see URLTransformer
  */
trait XURLTransformer
  extends StObject
     with XInterface {
  
  /**
    * assembles the parts of the {@link URL} specified by **aURL** and stores it into {@link URL.Complete}
    * @param aURL the {@link URL} which contains alls necessary information in a structured form. The member {@link URL.Complete} contains the {@link URL} in
    * @returns `TRUE` if assembling was successfully or `FALSE` otherwise.
    */
  def assemble(aURL: js.Array[URL]): Boolean
  
  /**
    * returns a representation of the {@link URL} for UI purposes only
    *
    * Sometimes it can be useful to show an {@link URL} on an user interface in a more "human readable" form. Such {@link URL} can't be used on any API
    * call, but make it easier for the user to understand it.
    * @param aURL in structured form which should be shown at the UI
    * @param bWithPassword specifies whether the password will be included in the encoding or not. Usually passwords should never be shown at the user interface.
    * @returns a string representing the **aURL** if it is syntactically correct. A empty string if **aURL** is not syntactically correct.
    */
  def getPresentation(aURL: URL, bWithPassword: Boolean): String
  
  /**
    * parses the string in {@link URL.Complete} , which may contain a syntactically complete {@link URL} or is specified by the provided protocol
    *
    * The implementation can use smart functions to correct or interpret {@link URL.Complete} if it is not a syntactically complete {@link URL} . The parts
    * of the {@link URL} are stored in the other fields of **aURL** .
    * @param aURL the {@link URL} which include the string notation and will contain all parsed parts of it after finishing this call. This includes {@link UR
    * @param sSmartProtocol optional information which protocol specification should be used to parse {@link URL.Complete} . If empty the implementation can u
    * @returns `TRUE` if parsing was successful (means if {@link URL.Complete} could be syntactically correct) or `FALSE` otherwise.
    */
  def parseSmart(aURL: js.Array[URL], sSmartProtocol: String): Boolean
  
  /**
    * parses the string in {@link URL.Complete} which should contain a syntactically complete {@link URL} .
    *
    * The implementation is allowed to correct minor failures in {@link URL.Complete} if the meaning of the {@link URL} remain unchanged. Parts of the
    * {@link URL} are stored in the other fields of **aURL** .
    * @param aURL the {@link URL} which include the complete string notation and will contain all parsed parts of it after finishing this call. {@link URL.Com
    * @returns `TRUE` if parsing was successfully (means if given {@link URL} was syntactically correct) or `FALSE` otherwise.
    */
  def parseStrict(aURL: js.Array[URL]): Boolean
}
object XURLTransformer {
  
  inline def apply(
    acquire: () => Unit,
    assemble: js.Array[URL] => Boolean,
    getPresentation: (URL, Boolean) => String,
    parseSmart: (js.Array[URL], String) => Boolean,
    parseStrict: js.Array[URL] => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XURLTransformer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), assemble = js.Any.fromFunction1(assemble), getPresentation = js.Any.fromFunction2(getPresentation), parseSmart = js.Any.fromFunction2(parseSmart), parseStrict = js.Any.fromFunction1(parseStrict), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XURLTransformer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XURLTransformer] (val x: Self) extends AnyVal {
    
    inline def setAssemble(value: js.Array[URL] => Boolean): Self = StObject.set(x, "assemble", js.Any.fromFunction1(value))
    
    inline def setGetPresentation(value: (URL, Boolean) => String): Self = StObject.set(x, "getPresentation", js.Any.fromFunction2(value))
    
    inline def setParseSmart(value: (js.Array[URL], String) => Boolean): Self = StObject.set(x, "parseSmart", js.Any.fromFunction2(value))
    
    inline def setParseStrict(value: js.Array[URL] => Boolean): Self = StObject.set(x, "parseStrict", js.Any.fromFunction1(value))
  }
}
