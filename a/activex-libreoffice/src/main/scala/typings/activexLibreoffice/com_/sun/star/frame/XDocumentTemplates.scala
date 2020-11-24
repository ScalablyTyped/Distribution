package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.ucb.XContent
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a high level API to organize document templates
  *
  * Template information are saved as links to the original content and organized in groups. This data should be persistent and can be updated by calling
  * special method {@link XDocumentTemplates.update()} . A real implementation of this interface can do that on top of an ucb content provider. Method
  * {@link XDocumentTemplates.getContent()} force that.
  */
@js.native
trait XDocumentTemplates extends XInterface {
  
  /**
    * provides access to the root of internal used hierarchy
    *
    * This content can be used for accessing the groups directly.
    * @returns the ucb content for template configuration
    */
  val Content: XContent = js.native
  
  /**
    * creates a new group
    * @param GroupName the name of the group to be created
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    */
  def addGroup(GroupName: String): Boolean = js.native
  
  /**
    * creates the template with the given name in the given group using the given URL
    * @param GroupName specifies the group
    * @param TemplateName specifies the template
    * @param SourceURL specifies the position of template
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    * @see XDocumentTemplates.storeTemplate()
    */
  def addTemplate(GroupName: String, TemplateName: String, SourceURL: String): Boolean = js.native
  
  /**
    * provides access to the root of internal used hierarchy
    *
    * This content can be used for accessing the groups directly.
    * @returns the ucb content for template configuration
    */
  def getContent(): XContent = js.native
  
  /**
    * remove an existing group
    * @param GroupName the name of the group to be removed
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    */
  def removeGroup(GroupName: String): Boolean = js.native
  
  /**
    * remove a template from specified group
    * @param GroupName specifies the group which include the template
    * @param TemplateName specifies the template for delete
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    */
  def removeTemplate(GroupName: String, TemplateName: String): Boolean = js.native
  
  /**
    * rename an existing group
    * @param OldGroupName the old name of the group
    * @param NewGroupName the new name of the group
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    */
  def renameGroup(OldGroupName: String, NewGroupName: String): Boolean = js.native
  
  /**
    * rename a template inside specified group
    * @param GroupName specifies the group which include the template
    * @param OldTemplateName specifies the template for renaming
    * @param NewTemplateName specifies the new name for the template
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    */
  def renameTemplate(GroupName: String, OldTemplateName: String, NewTemplateName: String): Boolean = js.native
  
  /**
    * creates the template with the given name in the given group using the data from the storable
    * @param GroupName specifies the group
    * @param TemplateName specifies the template
    * @param Storable specifies the target
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    * @see XDocumentTemplates.addTemplate()
    */
  def storeTemplate(GroupName: String, TemplateName: String, Storable: XStorable): Boolean = js.native
  
  /**
    * force an update for internal structures
    *
    * Because the templates are well known by links and not as direct content they can be outdated. An update force actualization of that to find wrong
    * links.
    */
  def update(): Unit = js.native
}
object XDocumentTemplates {
  
  @scala.inline
  def apply(
    Content: XContent,
    acquire: () => Unit,
    addGroup: String => Boolean,
    addTemplate: (String, String, String) => Boolean,
    getContent: () => XContent,
    queryInterface: `type` => js.Any,
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
  implicit class XDocumentTemplatesOps[Self <: XDocumentTemplates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContent(value: XContent): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddGroup(value: String => Boolean): Self = this.set("addGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddTemplate(value: (String, String, String) => Boolean): Self = this.set("addTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetContent(value: () => XContent): Self = this.set("getContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveGroup(value: String => Boolean): Self = this.set("removeGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveTemplate(value: (String, String) => Boolean): Self = this.set("removeTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenameGroup(value: (String, String) => Boolean): Self = this.set("renameGroup", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenameTemplate(value: (String, String, String) => Boolean): Self = this.set("renameTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStoreTemplate(value: (String, String, XStorable) => Boolean): Self = this.set("storeTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
