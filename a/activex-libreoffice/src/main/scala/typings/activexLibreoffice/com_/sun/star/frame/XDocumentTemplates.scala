package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.ucb.XContent
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a high level API to organize document templates
  *
  * Template information are saved as links to the original content and organized in groups. This data should be persistent and can be updated by calling
  * special method {@link XDocumentTemplates.update()} . A real implementation of this interface can do that on top of an ucb content provider. Method
  * {@link XDocumentTemplates.getContent()} force that.
  */
trait XDocumentTemplates
  extends StObject
     with XInterface {
  
  /**
    * provides access to the root of internal used hierarchy
    *
    * This content can be used for accessing the groups directly.
    * @returns the ucb content for template configuration
    */
  val Content: XContent
  
  /**
    * creates a new group
    * @param GroupName the name of the group to be created
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    */
  def addGroup(GroupName: String): Boolean
  
  /**
    * creates the template with the given name in the given group using the given URL
    * @param GroupName specifies the group
    * @param TemplateName specifies the template
    * @param SourceURL specifies the position of template
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    * @see XDocumentTemplates.storeTemplate()
    */
  def addTemplate(GroupName: String, TemplateName: String, SourceURL: String): Boolean
  
  /**
    * provides access to the root of internal used hierarchy
    *
    * This content can be used for accessing the groups directly.
    * @returns the ucb content for template configuration
    */
  def getContent(): XContent
  
  /**
    * remove an existing group
    * @param GroupName the name of the group to be removed
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    */
  def removeGroup(GroupName: String): Boolean
  
  /**
    * remove a template from specified group
    * @param GroupName specifies the group which include the template
    * @param TemplateName specifies the template for delete
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    */
  def removeTemplate(GroupName: String, TemplateName: String): Boolean
  
  /**
    * rename an existing group
    * @param OldGroupName the old name of the group
    * @param NewGroupName the new name of the group
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    */
  def renameGroup(OldGroupName: String, NewGroupName: String): Boolean
  
  /**
    * rename a template inside specified group
    * @param GroupName specifies the group which include the template
    * @param OldTemplateName specifies the template for renaming
    * @param NewTemplateName specifies the new name for the template
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    */
  def renameTemplate(GroupName: String, OldTemplateName: String, NewTemplateName: String): Boolean
  
  /**
    * creates the template with the given name in the given group using the data from the storable
    * @param GroupName specifies the group
    * @param TemplateName specifies the template
    * @param Storable specifies the target
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    * @see XDocumentTemplates.addTemplate()
    */
  def storeTemplate(GroupName: String, TemplateName: String, Storable: XStorable): Boolean
  
  /**
    * force an update for internal structures
    *
    * Because the templates are well known by links and not as direct content they can be outdated. An update force actualization of that to find wrong
    * links.
    */
  def update(): Unit
}
object XDocumentTemplates {
  
  inline def apply(
    Content: XContent,
    acquire: () => Unit,
    addGroup: String => Boolean,
    addTemplate: (String, String, String) => Boolean,
    getContent: () => XContent,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeGroup: String => Boolean,
    removeTemplate: (String, String) => Boolean,
    renameGroup: (String, String) => Boolean,
    renameTemplate: (String, String, String) => Boolean,
    storeTemplate: (String, String, XStorable) => Boolean,
    update: () => Unit
  ): XDocumentTemplates = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addGroup = js.Any.fromFunction1(addGroup), addTemplate = js.Any.fromFunction3(addTemplate), getContent = js.Any.fromFunction0(getContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeGroup = js.Any.fromFunction1(removeGroup), removeTemplate = js.Any.fromFunction2(removeTemplate), renameGroup = js.Any.fromFunction2(renameGroup), renameTemplate = js.Any.fromFunction3(renameTemplate), storeTemplate = js.Any.fromFunction3(storeTemplate), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[XDocumentTemplates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDocumentTemplates] (val x: Self) extends AnyVal {
    
    inline def setAddGroup(value: String => Boolean): Self = StObject.set(x, "addGroup", js.Any.fromFunction1(value))
    
    inline def setAddTemplate(value: (String, String, String) => Boolean): Self = StObject.set(x, "addTemplate", js.Any.fromFunction3(value))
    
    inline def setContent(value: XContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setGetContent(value: () => XContent): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
    
    inline def setRemoveGroup(value: String => Boolean): Self = StObject.set(x, "removeGroup", js.Any.fromFunction1(value))
    
    inline def setRemoveTemplate(value: (String, String) => Boolean): Self = StObject.set(x, "removeTemplate", js.Any.fromFunction2(value))
    
    inline def setRenameGroup(value: (String, String) => Boolean): Self = StObject.set(x, "renameGroup", js.Any.fromFunction2(value))
    
    inline def setRenameTemplate(value: (String, String, String) => Boolean): Self = StObject.set(x, "renameTemplate", js.Any.fromFunction3(value))
    
    inline def setStoreTemplate(value: (String, String, XStorable) => Boolean): Self = StObject.set(x, "storeTemplate", js.Any.fromFunction3(value))
    
    inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
