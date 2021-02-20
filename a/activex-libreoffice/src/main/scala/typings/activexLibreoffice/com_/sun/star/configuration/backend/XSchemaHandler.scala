package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives a description of a configuration schema as a sequence of events.
  * @since OOo 1.1.2
  */
@js.native
trait XSchemaHandler extends XInterface {
  
  /**
    * receives notification that the current group has a child node that is an instance of a specified template.
    * @param aName specifies the name of the new node.
    * @param aTemplate specifies a template that describes the new node.
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group node in progress currentlyif there already is a node with t
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addInstance(aName: String, aTemplate: TemplateIdentifier): Unit = js.native
  
  /**
    * receives notification that the current set can contain items that are instances of a specified template.
    * @param aItemType specifies a template that is accepted as valid item type for the current set node.
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a set node in progress currentlyif the template is not foundif the
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addItemType(aItemType: TemplateIdentifier): Unit = js.native
  
  /**
    * receives notification that a property is added to the current node.
    *
    * The property will have a default value of `NULL` (unless it is {@link SchemaAttribute.REQUIRED} ).
    * @param aName specifies the name of the new property.
    * @param aAttributes specifies the attributes of the new property.  The value is a combination of {@link SchemaAttribute} flags.
    * @param aType specifies the type of the new property.
    * @see com.sun.star.configuration.backend.SchemaAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group or extensible node in progress currentlyif a property with
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addProperty(aName: String, aAttributes: Double, aType: `type`): Unit = js.native
  
  /**
    * receives notification that a property having a default value is added to the current node.
    * @param aName specifies the name of the new property.
    * @param aAttributes specifies the attributes of the new property.  The value is a combination of {@link SchemaAttribute} flags.
    * @param aDefaultValue specifies the value of the new property.  The value also determines the type. Therefore the value must not be `VOID` .
    * @see com.sun.star.configuration.backend.SchemaAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group or extensible node in progress currentlyif a property with
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addPropertyWithDefault(aName: String, aAttributes: Double, aDefaultValue: js.Any): Unit = js.native
  
  /**
    * receives notification that a component description is complete.
    *
    * Must match a previous call to {@link startComponent()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if invalid data is detected in the componentif there is a unfinished subnode in pr
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endComponent(): Unit = js.native
  
  /**
    * receives notification that a node description is complete.
    *
    * Must match the last open call to {@link startGroup()} or {@link startSet()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if the name is not a the name of the node in progressif invalid data is detected i
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endNode(): Unit = js.native
  
  /**
    * receives notification that the current schema description is complete.
    *
    * Must match a previous call to {@link startSchema()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if invalid data is detected in the schemaif there is a unfinished component or tem
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endSchema(): Unit = js.native
  
  /**
    * receives notification that a template description is complete.
    *
    * Must match a previous call to {@link startGroupTemplate()} or {@link startSetTemplate()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if invalid data is detected in the templateif there is a unfinished subnode in pro
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endTemplate(): Unit = js.native
  
  /**
    * receives notification that the schema depends on templates from a different component.
    * @param aName specifies the name of the component.
    * @throws com::sun::star::configuration::backend::MalformedDataException if there is a unfinished component or template in progressif no schema is started
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def importComponent(aName: String): Unit = js.native
  
  /**
    * receives notification that a component description is started.
    *
    * Subsequent calls describe the schema of the component until a matching call to {@link endComponent()} is encountered.
    * @param aName specifies the name of the component.
    * @throws com::sun::star::configuration::backend::MalformedDataException if there is a unfinished component or template in progressif no schema is started
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def startComponent(aName: String): Unit = js.native
  
  /**
    * receives notification that a group description is started.
    *
    * Subsequent calls describe the members and properties of the group until a matching call to {@link endNode()} is encountered.
    * @param aName specifies the name of the group.
    * @param aAttributes specifies the attributes of the node.  The value is a combination of {@link SchemaAttribute} flags.  {@link SchemaAttribute.EXTENSIBL
    * @see com.sun.star.configuration.backend.SchemaAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group node in progress currentlyif there already is a node with t
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def startGroup(aName: String, aAttributes: Double): Unit = js.native
  
  /**
    * receives notification that a template description is started for a group.
    *
    * Subsequent calls describe the members and properties of the template until a matching call to {@link endTemplate()} is encountered.
    * @param aTemplate specifies the identity of the template.
    * @param aAttributes specifies the attributes of the template.  The value is a combination of {@link SchemaAttribute} flags.  {@link SchemaAttribute.EXTEN
    * @see com.sun.star.configuration.backend.SchemaAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there is a unfinished component or template in progressif no schema is started
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def startGroupTemplate(aTemplate: TemplateIdentifier, aAttributes: Double): Unit = js.native
  
  /**
    * receives notification that a schema description is started.
    *
    * The schema description may comprise components templates or both.
    * @throws com::sun::star::configuration::backend::MalformedDataException if a schema is already started (and has not been ended).
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def startSchema(): Unit = js.native
  
  /**
    * receives notification that a set description is started.
    *
    * Subsequent calls describe the item-types and properties of the set until a matching call to {@link endNode()} is encountered.
    * @param aName specifies the name of the set.
    * @param aAttributes specifies the attributes of the node.  The value is a combination of {@link SchemaAttribute} flags.  {@link SchemaAttribute.EXTENSIBL
    * @param aItemType specifies the (default) template for set items.
    * @see com.sun.star.configuration.backend.SchemaAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group node in progress currentlyif there already is a node with t
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def startSet(aName: String, aAttributes: Double, aItemType: TemplateIdentifier): Unit = js.native
  
  /**
    * receives notification that a template description is started for a set.
    *
    * Subsequent calls describe the members and properties of the template until a matching call to {@link endTemplate()} is encountered.
    * @param aTemplate specifies the identity of the template.
    * @param aAttributes specifies the attributes of the template.  The value is a combination of {@link SchemaAttribute} flags.  {@link SchemaAttribute.EXTEN
    * @param aItemType specifies the (default) template for set items.
    * @see com.sun.star.configuration.backend.SchemaAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there is a unfinished component or template in progressif no schema is started
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def startSetTemplate(aTemplate: TemplateIdentifier, aAttributes: Double, aItemType: TemplateIdentifier): Unit = js.native
}
object XSchemaHandler {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addInstance: (String, TemplateIdentifier) => Unit,
    addItemType: TemplateIdentifier => Unit,
    addProperty: (String, Double, `type`) => Unit,
    addPropertyWithDefault: (String, Double, js.Any) => Unit,
    endComponent: () => Unit,
    endNode: () => Unit,
    endSchema: () => Unit,
    endTemplate: () => Unit,
    importComponent: String => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    startComponent: String => Unit,
    startGroup: (String, Double) => Unit,
    startGroupTemplate: (TemplateIdentifier, Double) => Unit,
    startSchema: () => Unit,
    startSet: (String, Double, TemplateIdentifier) => Unit,
    startSetTemplate: (TemplateIdentifier, Double, TemplateIdentifier) => Unit
  ): XSchemaHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addInstance = js.Any.fromFunction2(addInstance), addItemType = js.Any.fromFunction1(addItemType), addProperty = js.Any.fromFunction3(addProperty), addPropertyWithDefault = js.Any.fromFunction3(addPropertyWithDefault), endComponent = js.Any.fromFunction0(endComponent), endNode = js.Any.fromFunction0(endNode), endSchema = js.Any.fromFunction0(endSchema), endTemplate = js.Any.fromFunction0(endTemplate), importComponent = js.Any.fromFunction1(importComponent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startComponent = js.Any.fromFunction1(startComponent), startGroup = js.Any.fromFunction2(startGroup), startGroupTemplate = js.Any.fromFunction2(startGroupTemplate), startSchema = js.Any.fromFunction0(startSchema), startSet = js.Any.fromFunction3(startSet), startSetTemplate = js.Any.fromFunction3(startSetTemplate))
    __obj.asInstanceOf[XSchemaHandler]
  }
  
  @scala.inline
  implicit class XSchemaHandlerMutableBuilder[Self <: XSchemaHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddInstance(value: (String, TemplateIdentifier) => Unit): Self = StObject.set(x, "addInstance", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddItemType(value: TemplateIdentifier => Unit): Self = StObject.set(x, "addItemType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddProperty(value: (String, Double, `type`) => Unit): Self = StObject.set(x, "addProperty", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAddPropertyWithDefault(value: (String, Double, js.Any) => Unit): Self = StObject.set(x, "addPropertyWithDefault", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEndComponent(value: () => Unit): Self = StObject.set(x, "endComponent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndNode(value: () => Unit): Self = StObject.set(x, "endNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndSchema(value: () => Unit): Self = StObject.set(x, "endSchema", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndTemplate(value: () => Unit): Self = StObject.set(x, "endTemplate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImportComponent(value: String => Unit): Self = StObject.set(x, "importComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartComponent(value: String => Unit): Self = StObject.set(x, "startComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartGroup(value: (String, Double) => Unit): Self = StObject.set(x, "startGroup", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartGroupTemplate(value: (TemplateIdentifier, Double) => Unit): Self = StObject.set(x, "startGroupTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartSchema(value: () => Unit): Self = StObject.set(x, "startSchema", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartSet(value: (String, Double, TemplateIdentifier) => Unit): Self = StObject.set(x, "startSet", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStartSetTemplate(value: (TemplateIdentifier, Double, TemplateIdentifier) => Unit): Self = StObject.set(x, "startSetTemplate", js.Any.fromFunction3(value))
  }
}
