package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives a description of a configuration update or layer as a sequence of events.
  * @since OOo 1.1.2
  */
trait XUpdateHandler
  extends StObject
     with XInterface {
  
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
  def addOrReplaceNode(aName: String, aAttributes: Double): Unit
  
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
  def addOrReplaceNodeFromTemplate(aName: String, aAttributes: Double, aTemplate: TemplateIdentifier): Unit
  
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
  def addOrReplaceProperty(aName: String, aAttributes: Double, aType: `type`): Unit
  
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
  def addOrReplacePropertyWithValue(aName: String, aAttributes: Double, aValue: js.Any): Unit
  
  /**
    * receives notification that a node modification is complete.
    *
    * Must match the last open call to {@link XUpdateHandler.modifyNode()} , {@link XUpdateHandler.addOrReplaceNode()} or {@link
    * XUpdateHandler.addOrReplaceNodeFromTemplate()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if invalid data is detected in the nodeif no node is started at all**Not every imp
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endNode(): Unit
  
  /**
    * receives notification that a property modification is complete.
    *
    * Must match the last open call to {@link XUpdateHandler.modifyProperty()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if invalid data is detected in the propertyif no property is started at all**Not e
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endProperty(): Unit
  
  /**
    * receives notification that the current update description is complete.
    *
    * Must match a previous call to {@link XUpdateHandler.startUpdate()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if no update is started at allif invalid data is detected in the updateif there is
    * @throws com::sun::star::lang::IllegalAccessException if the target layer is read-only
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endUpdate(): Unit
  
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
  def modifyNode(aName: String, aAttributes: Double, aAttributeMask: Double, bReset: Boolean): Unit
  
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
  def modifyProperty(aName: String, aAttributes: Double, aAttributeMask: Double, aType: `type`): Unit
  
  /**
    * receives notification that an item is to be dropped from a set.
    *
    * The current node must be a set and the item must be removable.
    * @param aName specifies the name of the node.
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a set node in progress currentlyif there already was a change to a
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def removeNode(aName: String): Unit
  
  /**
    * receives notification that a property is dropped from the current node.
    *
    * The current node must be extensible and the property removable.
    * @param aName specifies the name of the property.
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group or extensible node in progress currentlyif there is no prop
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def removeProperty(aName: String): Unit
  
  /**
    * receives notification that a property is reset to its default state.
    * @param aName specifies the name of the property.
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group or extensible node in progress currentlyif there already wa
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def resetProperty(aName: String): Unit
  
  /**
    * receives notification that the value of the current property should be reset to its default.
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a property modification in progress currentlyif there already was a
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def resetPropertyValue(): Unit
  
  /**
    * receives notification that the value of the current property for a specific locale should be reset to its default.
    * @param aLocale specifies the locale the change applies to.
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a property modification in progress currentlyif the property is not
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def resetPropertyValueForLocale(aLocale: String): Unit
  
  /**
    * receives notification about a change to the value of the current property.
    * @param aValue specifies the new value of the property.  The value must match the type of the existing property. If the property does not have the {@link
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a property modification in progress currentlyif there already was a
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def setPropertyValue(aValue: js.Any): Unit
  
  /**
    * receives notification about a change to the value of the current property for a specific locale.
    * @param aValue specifies the new value of the property for the given locale.  The value must match the type of the existing property. If the property doe
    * @param aLocale specifies the locale that the new value applies to.
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a property modification in progress currentlyif the property is not
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def setPropertyValueForLocale(aValue: js.Any, aLocale: String): Unit
  
  /**
    * receives notification that a update or description is started.
    * @throws com::sun::star::configuration::backend::MalformedDataException if the update already was started
    * @throws com::sun::star::lang::IllegalAccessException if the target layer is read-only**Some implementations can only detect this when executing XUpdateHa
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def startUpdate(): Unit
}
object XUpdateHandler {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addOrReplaceNode: (String, Double) => Unit,
    addOrReplaceNodeFromTemplate: (String, Double, TemplateIdentifier) => Unit,
    addOrReplaceProperty: (String, Double, `type`) => Unit,
    addOrReplacePropertyWithValue: (String, Double, js.Any) => Unit,
    endNode: () => Unit,
    endProperty: () => Unit,
    endUpdate: () => Unit,
    modifyNode: (String, Double, Double, Boolean) => Unit,
    modifyProperty: (String, Double, Double, `type`) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeNode: String => Unit,
    removeProperty: String => Unit,
    resetProperty: String => Unit,
    resetPropertyValue: () => Unit,
    resetPropertyValueForLocale: String => Unit,
    setPropertyValue: js.Any => Unit,
    setPropertyValueForLocale: (js.Any, String) => Unit,
    startUpdate: () => Unit
  ): XUpdateHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addOrReplaceNode = js.Any.fromFunction2(addOrReplaceNode), addOrReplaceNodeFromTemplate = js.Any.fromFunction3(addOrReplaceNodeFromTemplate), addOrReplaceProperty = js.Any.fromFunction3(addOrReplaceProperty), addOrReplacePropertyWithValue = js.Any.fromFunction3(addOrReplacePropertyWithValue), endNode = js.Any.fromFunction0(endNode), endProperty = js.Any.fromFunction0(endProperty), endUpdate = js.Any.fromFunction0(endUpdate), modifyNode = js.Any.fromFunction4(modifyNode), modifyProperty = js.Any.fromFunction4(modifyProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeNode = js.Any.fromFunction1(removeNode), removeProperty = js.Any.fromFunction1(removeProperty), resetProperty = js.Any.fromFunction1(resetProperty), resetPropertyValue = js.Any.fromFunction0(resetPropertyValue), resetPropertyValueForLocale = js.Any.fromFunction1(resetPropertyValueForLocale), setPropertyValue = js.Any.fromFunction1(setPropertyValue), setPropertyValueForLocale = js.Any.fromFunction2(setPropertyValueForLocale), startUpdate = js.Any.fromFunction0(startUpdate))
    __obj.asInstanceOf[XUpdateHandler]
  }
  
  @scala.inline
  implicit class XUpdateHandlerMutableBuilder[Self <: XUpdateHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOrReplaceNode(value: (String, Double) => Unit): Self = StObject.set(x, "addOrReplaceNode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddOrReplaceNodeFromTemplate(value: (String, Double, TemplateIdentifier) => Unit): Self = StObject.set(x, "addOrReplaceNodeFromTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAddOrReplaceProperty(value: (String, Double, `type`) => Unit): Self = StObject.set(x, "addOrReplaceProperty", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAddOrReplacePropertyWithValue(value: (String, Double, js.Any) => Unit): Self = StObject.set(x, "addOrReplacePropertyWithValue", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEndNode(value: () => Unit): Self = StObject.set(x, "endNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndProperty(value: () => Unit): Self = StObject.set(x, "endProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndUpdate(value: () => Unit): Self = StObject.set(x, "endUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setModifyNode(value: (String, Double, Double, Boolean) => Unit): Self = StObject.set(x, "modifyNode", js.Any.fromFunction4(value))
    
    @scala.inline
    def setModifyProperty(value: (String, Double, Double, `type`) => Unit): Self = StObject.set(x, "modifyProperty", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRemoveNode(value: String => Unit): Self = StObject.set(x, "removeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveProperty(value: String => Unit): Self = StObject.set(x, "removeProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetProperty(value: String => Unit): Self = StObject.set(x, "resetProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetPropertyValue(value: () => Unit): Self = StObject.set(x, "resetPropertyValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetPropertyValueForLocale(value: String => Unit): Self = StObject.set(x, "resetPropertyValueForLocale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPropertyValue(value: js.Any => Unit): Self = StObject.set(x, "setPropertyValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPropertyValueForLocale(value: (js.Any, String) => Unit): Self = StObject.set(x, "setPropertyValueForLocale", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartUpdate(value: () => Unit): Self = StObject.set(x, "startUpdate", js.Any.fromFunction0(value))
  }
}
