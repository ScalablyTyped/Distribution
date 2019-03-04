package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * receives a description of a configuration schema as a sequence of events.
  * @since OOo 1.1.2
  */
trait XSchemaHandler
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * receives notification that the current group has a child node that is an instance of a specified template.
    * @param aName specifies the name of the new node.
    * @param aTemplate specifies a template that describes the new node.
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group node in progress currentlyif there already is a node with t
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addInstance(aName: java.lang.String, aTemplate: TemplateIdentifier): scala.Unit
  /**
    * receives notification that the current set can contain items that are instances of a specified template.
    * @param aItemType specifies a template that is accepted as valid item type for the current set node.
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a set node in progress currentlyif the template is not foundif the
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addItemType(aItemType: TemplateIdentifier): scala.Unit
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
  def addProperty(aName: java.lang.String, aAttributes: scala.Double, aType: activexDashLibreofficeLib.`type`): scala.Unit
  /**
    * receives notification that a property having a default value is added to the current node.
    * @param aName specifies the name of the new property.
    * @param aAttributes specifies the attributes of the new property.  The value is a combination of {@link SchemaAttribute} flags.
    * @param aDefaultValue specifies the value of the new property.  The value also determines the type. Therefore the value must not be `VOID` .
    * @see com.sun.star.configuration.backend.SchemaAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group or extensible node in progress currentlyif a property with
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addPropertyWithDefault(aName: java.lang.String, aAttributes: scala.Double, aDefaultValue: js.Any): scala.Unit
  /**
    * receives notification that a component description is complete.
    *
    * Must match a previous call to {@link startComponent()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if invalid data is detected in the componentif there is a unfinished subnode in pr
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endComponent(): scala.Unit
  /**
    * receives notification that a node description is complete.
    *
    * Must match the last open call to {@link startGroup()} or {@link startSet()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if the name is not a the name of the node in progressif invalid data is detected i
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endNode(): scala.Unit
  /**
    * receives notification that the current schema description is complete.
    *
    * Must match a previous call to {@link startSchema()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if invalid data is detected in the schemaif there is a unfinished component or tem
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endSchema(): scala.Unit
  /**
    * receives notification that a template description is complete.
    *
    * Must match a previous call to {@link startGroupTemplate()} or {@link startSetTemplate()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if invalid data is detected in the templateif there is a unfinished subnode in pro
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endTemplate(): scala.Unit
  /**
    * receives notification that the schema depends on templates from a different component.
    * @param aName specifies the name of the component.
    * @throws com::sun::star::configuration::backend::MalformedDataException if there is a unfinished component or template in progressif no schema is started
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def importComponent(aName: java.lang.String): scala.Unit
  /**
    * receives notification that a component description is started.
    *
    * Subsequent calls describe the schema of the component until a matching call to {@link endComponent()} is encountered.
    * @param aName specifies the name of the component.
    * @throws com::sun::star::configuration::backend::MalformedDataException if there is a unfinished component or template in progressif no schema is started
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def startComponent(aName: java.lang.String): scala.Unit
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
  def startGroup(aName: java.lang.String, aAttributes: scala.Double): scala.Unit
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
  def startGroupTemplate(aTemplate: TemplateIdentifier, aAttributes: scala.Double): scala.Unit
  /**
    * receives notification that a schema description is started.
    *
    * The schema description may comprise components templates or both.
    * @throws com::sun::star::configuration::backend::MalformedDataException if a schema is already started (and has not been ended).
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def startSchema(): scala.Unit
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
  def startSet(aName: java.lang.String, aAttributes: scala.Double, aItemType: TemplateIdentifier): scala.Unit
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
  def startSetTemplate(aTemplate: TemplateIdentifier, aAttributes: scala.Double, aItemType: TemplateIdentifier): scala.Unit
}

object XSchemaHandler {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addInstance: js.Function2[java.lang.String, TemplateIdentifier, scala.Unit],
    addItemType: js.Function1[TemplateIdentifier, scala.Unit],
    addProperty: js.Function3[java.lang.String, scala.Double, activexDashLibreofficeLib.`type`, scala.Unit],
    addPropertyWithDefault: js.Function3[java.lang.String, scala.Double, js.Any, scala.Unit],
    endComponent: js.Function0[scala.Unit],
    endNode: js.Function0[scala.Unit],
    endSchema: js.Function0[scala.Unit],
    endTemplate: js.Function0[scala.Unit],
    importComponent: js.Function1[java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    startComponent: js.Function1[java.lang.String, scala.Unit],
    startGroup: js.Function2[java.lang.String, scala.Double, scala.Unit],
    startGroupTemplate: js.Function2[TemplateIdentifier, scala.Double, scala.Unit],
    startSchema: js.Function0[scala.Unit],
    startSet: js.Function3[java.lang.String, scala.Double, TemplateIdentifier, scala.Unit],
    startSetTemplate: js.Function3[TemplateIdentifier, scala.Double, TemplateIdentifier, scala.Unit]
  ): XSchemaHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire, addInstance = addInstance, addItemType = addItemType, addProperty = addProperty, addPropertyWithDefault = addPropertyWithDefault, endComponent = endComponent, endNode = endNode, endSchema = endSchema, endTemplate = endTemplate, importComponent = importComponent, queryInterface = queryInterface, release = release, startComponent = startComponent, startGroup = startGroup, startGroupTemplate = startGroupTemplate, startSchema = startSchema, startSet = startSet, startSetTemplate = startSetTemplate)
  
    __obj.asInstanceOf[XSchemaHandler]
  }
}

