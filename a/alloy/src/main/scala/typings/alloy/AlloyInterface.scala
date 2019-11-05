package typings.alloy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Top-level module for Alloy functions.
  */
@js.native
trait AlloyInterface extends js.Object {
  /**
    * An object that stores Alloy configuration values as defined in your app's app/config.json file
    */
  var CFG: js.Any = js.native
  /**
    * An object for storing globally accessible Alloy collections. Singleton collections created via markup will be stored on this object.
    */
  var Collections: Anon_Instance = js.native
  /**
    * An object for storing globally accessible variables and functions.
    */
  var Globals: js.Any = js.native
  /**
    * An object for storing globally accessible Alloy models. Singleton models created via markup will be stored on this object.
    */
  var Models: js.Any = js.native
  /**
    * Returns true if the current device is a handheld device (not a tablet).
    */
  var isHandheld: Boolean = js.native
  /**
    * true if the current device is a tablet.
    */
  var isTablet: Boolean = js.native
  /**
    * Factory method for instantiating a Backbone collection of model objects. Creates and returns a collection for holding the named type of model objects.
    *
    * @param name Name of model to hold in this collection.
    * @param args Arguments to pass to the collection.
    */
  def createCollection(name: String): js.Any = js.native
  def createCollection(name: String, args: js.Any): js.Any = js.native
  /**
    * Factory method for instantiating a controller. Creates and returns an instance of the named controller.
    *
    * @param name Name of controller to instantiate.
    * @param args Arguments to pass to the controller
    */
  def createController(name: String): AlloyController = js.native
  def createController(name: String, args: js.Any): AlloyController = js.native
  /**
    * Factory method for instantiating a Backbone Model object. Creates and returns an instance of the named model.
    *
    * @param name Name of model to instantiate.
    * @param args Arguments to pass to the model.
    */
  def createModel(name: String): js.Any = js.native
  def createModel(name: String, args: js.Any): js.Any = js.native
  /**
    * Factory method for instantiating a widget controller. Creates and returns an instance of the named widget.
    *
    * @param id Id of widget to instantiate.
    * @param name Name of the view within the widget to instantiate ('widget' by default)
    * @param args Arguments to pass to the widget.
    */
  def createWidget(id: String): AlloyController = js.native
  def createWidget(id: String, args: js.Any): AlloyController = js.native
  def createWidget(id: String, name: String): AlloyController = js.native
  def createWidget(id: String, name: String, args: js.Any): AlloyController = js.native
}

