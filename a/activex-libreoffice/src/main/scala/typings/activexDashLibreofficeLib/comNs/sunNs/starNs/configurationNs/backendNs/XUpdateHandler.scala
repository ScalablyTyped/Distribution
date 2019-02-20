package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * receives a description of a configuration update or layer as a sequence of events.
  * @since OOo 1.1.2
  */
trait XUpdateHandler
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * receives notification that a node is started as a new item.
    *
    * The current node must be a set and a preexisting item (if any) must be removable.
    *
    * The new item will be created from the default template of the set.
    *
    * Subsequent calls describe the difference from the template of properties, items or members of the node until a matching call to {@link
    * XUpdateHandler.endNode()} is encountered.
    * @param aName specifies the name of the new item.
    * @param aAttributes specifies attribute values to be applied to the new node.  The value is a combination of {@link NodeAttribute} flags. Note that {@lin
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a set node in progress currentlyif there already was a change to an
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addOrReplaceNode(aName: java.lang.String, aAttributes: scala.Double): scala.Unit
  /**
    * receives notification that a node is started as a new item based on a particular template.
    *
    * The current node must be a set and a preexisting item (if any) must be removable.
    *
    * Subsequent calls describe the difference from the template of properties or members of the node until a matching call to {@link
    * XUpdateHandler.endNode()} is encountered.
    * @param aName specifies the name of the item.
    * @param aTemplate specifies the template to use for the new node
    * @param aAttributes specifies attribute values to be applied to the new node.  The value is a combination of {@link NodeAttribute} flags. Note that {@lin
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a set node in progress currentlyif there already was a change to an
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addOrReplaceNodeFromTemplate(aName: java.lang.String, aAttributes: scala.Double, aTemplate: TemplateIdentifier): scala.Unit
  /**
    * receives notification that a property having a value of `VOID` is added to the current node.
    *
    * The current node must be extensible and a preexisting property (if any) must be removable in this layer.
    * @param aName specifies the name of the new property.
    * @param aAttributes specifies the attributes of the new property.  The value is a combination of {@link NodeAttribute} flags and may also contain the {@l
    * @param aType specifies the type of the new property.
    * @see com.sun.star.configuration.backend.SchemaAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group or extensible node in progress currentlyif there already wa
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addOrReplaceProperty(aName: java.lang.String, aAttributes: scala.Double, aType: activexDashLibreofficeLib.`type`): scala.Unit
  /**
    * receives notification that a property having a non- `NULL` value is added to the current node.
    *
    * The current node must be extensible and a preexisting property (if any) must be removable in this layer.
    * @param aName specifies the name of the new property.
    * @param aAttributes specifies the attributes of the new property.  The value is a combination of {@link NodeAttribute} flags and may also contain the {@l
    * @param aValue specifies the value of the new property.  The value also determines the type. Therefore the value must not be `VOID` .
    * @see com.sun.star.configuration.backend.SchemaAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group or extensible node in progress currentlyif there already wa
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addOrReplacePropertyWithValue(aName: java.lang.String, aAttributes: scala.Double, aValue: js.Any): scala.Unit
  /**
    * receives notification that a node modification is complete.
    *
    * Must match the last open call to {@link XUpdateHandler.modifyNode()} , {@link XUpdateHandler.addOrReplaceNode()} or {@link
    * XUpdateHandler.addOrReplaceNodeFromTemplate()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if invalid data is detected in the nodeif no node is started at all**Not every imp
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endNode(): scala.Unit
  /**
    * receives notification that a property modification is complete.
    *
    * Must match the last open call to {@link XUpdateHandler.modifyProperty()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if invalid data is detected in the propertyif no property is started at all**Not e
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endProperty(): scala.Unit
  /**
    * receives notification that the current update description is complete.
    *
    * Must match a previous call to {@link XUpdateHandler.startUpdate()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if no update is started at allif invalid data is detected in the updateif there is
    * @throws com::sun::star::lang::IllegalAccessException if the target layer is read-only
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endUpdate(): scala.Unit
  /**
    * receives notification that a modification of a node is started.
    *
    * Subsequent calls describe changes to properties and items or members of the node until a matching call to {@link XUpdateHandler.endNode()} is
    * encountered.
    * @param aName specifies the name of the node.
    * @param aAttributes specifies attribute values to be applied to the node in the current layer.  The value is a combination of {@link NodeAttribute} flags
    * @param aAttributeMask specifies which attributes should be changed for the node.  The value is a combination of {@link NodeAttribute} flags.
    * @param bReset if `TRUE` , specifies that the node should be reset to its default state as given by lower layers and the schema or template prior to appl
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't an update in progress at allif a node is not valid in this placeif
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def modifyNode(
    aName: java.lang.String,
    aAttributes: scala.Double,
    aAttributeMask: scala.Double,
    bReset: scala.Boolean
  ): scala.Unit
  /**
    * receives notification that modification of an existing property is started.
    *
    * Subsequent calls describe changes to the value(s) of the property until a matching call to {@link XUpdateHandler.endProperty()} is encountered.
    * @param aName specifies the name of the property.
    * @param aAttributes specifies new attributes of the property.  The value is a combination of {@link NodeAttribute} flags.  Only attributes which are sele
    * @param aAttributeMask specifies which attributes should be changed for the property.  The value is a combination of {@link NodeAttribute} flags.
    * @param aType specifies the type of the property.  A `VOID` type can be used to signify that the type is unknown and should not be recorded.
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group or extensible node in progress currentlyif there already wa
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def modifyProperty(
    aName: java.lang.String,
    aAttributes: scala.Double,
    aAttributeMask: scala.Double,
    aType: activexDashLibreofficeLib.`type`
  ): scala.Unit
  /**
    * receives notification that an item is to be dropped from a set.
    *
    * The current node must be a set and the item must be removable.
    * @param aName specifies the name of the node.
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a set node in progress currentlyif there already was a change to a
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def removeNode(aName: java.lang.String): scala.Unit
  /**
    * receives notification that a property is dropped from the current node.
    *
    * The current node must be extensible and the property removable.
    * @param aName specifies the name of the property.
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group or extensible node in progress currentlyif there is no prop
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def removeProperty(aName: java.lang.String): scala.Unit
  /**
    * receives notification that a property is reset to its default state.
    * @param aName specifies the name of the property.
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group or extensible node in progress currentlyif there already wa
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def resetProperty(aName: java.lang.String): scala.Unit
  /**
    * receives notification that the value of the current property should be reset to its default.
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a property modification in progress currentlyif there already was a
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def resetPropertyValue(): scala.Unit
  /**
    * receives notification that the value of the current property for a specific locale should be reset to its default.
    * @param aLocale specifies the locale the change applies to.
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a property modification in progress currentlyif the property is not
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def resetPropertyValueForLocale(aLocale: java.lang.String): scala.Unit
  /**
    * receives notification about a change to the value of the current property.
    * @param aValue specifies the new value of the property.  The value must match the type of the existing property. If the property does not have the {@link
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a property modification in progress currentlyif there already was a
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def setPropertyValue(aValue: js.Any): scala.Unit
  /**
    * receives notification about a change to the value of the current property for a specific locale.
    * @param aValue specifies the new value of the property for the given locale.  The value must match the type of the existing property. If the property doe
    * @param aLocale specifies the locale that the new value applies to.
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a property modification in progress currentlyif the property is not
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def setPropertyValueForLocale(aValue: js.Any, aLocale: java.lang.String): scala.Unit
  /**
    * receives notification that a update or description is started.
    * @throws com::sun::star::configuration::backend::MalformedDataException if the update already was started
    * @throws com::sun::star::lang::IllegalAccessException if the target layer is read-only**Some implementations can only detect this when executing XUpdateHa
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def startUpdate(): scala.Unit
}

