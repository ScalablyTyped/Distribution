package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing a library and provides access to its modules
  * @deprecated Deprecated
  */
trait XStarBasicAccess
  extends StObject
     with XInterface {
  
  /** returns the library container giving access to the libraries stored in a document or basic library file. */
  val LibraryContainer: XNameContainer
  
  /**
    * Adds an old style basic dialog (SI controls) to an existing (e.g., created by createLibrary) library. By using this method together with createLibrary
    * the caller does not have to implement {@link XStarBasicLibraryInfo} and {@link XStarBasicDialogInfo}
    * @throws NoSuchElementException if the library doesn't exist.
    */
  def addDialog(LibraryName: String, DialogName: String, Data: SeqEquiv[Double]): Unit
  
  /**
    * Adds a module to an existing (e.g., created by createLibrary) library. By using this method together with createLibrary the caller does not have to
    * implement {@link XStarBasicLibraryInfo} and XModuleInfo.
    * @throws NoSuchElementException if the library doesn't exist.
    */
  def addModule(LibraryName: String, ModuleName: String, Language: String, Source: String): Unit
  
  /**
    * Creates an empty library. This method can be called alternatively to accessing directly the NameContainer returned by getLibraryContainer. By using
    * this method together with addModule and addStarBasicDialog the caller does not have to implement {@link XStarBasicLibraryInfo} , XModuleInfo, and
    * {@link XStarBasicDialogInfo}
    */
  def createLibrary(LibName: String, Password: String, ExternalSourceURL: String, LinkTargetURL: String): Unit
  
  /** returns the library container giving access to the libraries stored in a document or basic library file. */
  def getLibraryContainer(): XNameContainer
}
object XStarBasicAccess {
  
  inline def apply(
    LibraryContainer: XNameContainer,
    acquire: () => Unit,
    addDialog: (String, String, SeqEquiv[Double]) => Unit,
    addModule: (String, String, String, String) => Unit,
    createLibrary: (String, String, String, String) => Unit,
    getLibraryContainer: () => XNameContainer,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStarBasicAccess = {
    val __obj = js.Dynamic.literal(LibraryContainer = LibraryContainer.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addDialog = js.Any.fromFunction3(addDialog), addModule = js.Any.fromFunction4(addModule), createLibrary = js.Any.fromFunction4(createLibrary), getLibraryContainer = js.Any.fromFunction0(getLibraryContainer), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStarBasicAccess]
  }
  
  extension [Self <: XStarBasicAccess](x: Self) {
    
    inline def setAddDialog(value: (String, String, SeqEquiv[Double]) => Unit): Self = StObject.set(x, "addDialog", js.Any.fromFunction3(value))
    
    inline def setAddModule(value: (String, String, String, String) => Unit): Self = StObject.set(x, "addModule", js.Any.fromFunction4(value))
    
    inline def setCreateLibrary(value: (String, String, String, String) => Unit): Self = StObject.set(x, "createLibrary", js.Any.fromFunction4(value))
    
    inline def setGetLibraryContainer(value: () => XNameContainer): Self = StObject.set(x, "getLibraryContainer", js.Any.fromFunction0(value))
    
    inline def setLibraryContainer(value: XNameContainer): Self = StObject.set(x, "LibraryContainer", value.asInstanceOf[js.Any])
  }
}
