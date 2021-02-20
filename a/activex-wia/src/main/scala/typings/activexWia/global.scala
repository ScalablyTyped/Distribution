package typings.activexWia

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object WIA {
    
    /**
      * The CommonDialog control is an invisible-at-runtime control that contains all the methods that display a User Interface. A CommonDialog control can be
      * created using "WIA.CommonDialog" in a call to CreateObject or by dropping a CommonDialog on a form.
      */
    @JSGlobal("WIA.CommonDialog")
    @js.native
    class CommonDialog protected ()
      extends typings.activexWia.WIA.CommonDialog
    
    /** The Device object represents an active connection to an imaging device. */
    @JSGlobal("WIA.Device")
    @js.native
    class Device protected ()
      extends typings.activexWia.WIA.Device
    
    /** The DeviceCommand object describes a CommandID that can be used when calling ExecuteCommand on a Device or Item object. */
    @JSGlobal("WIA.DeviceCommand")
    @js.native
    class DeviceCommand protected ()
      extends typings.activexWia.WIA.DeviceCommand
    
    /** The DeviceEvent object describes an EventID that can be used when calling RegisterEvent or RegisterPersistentEvent on a DeviceManager object. */
    @JSGlobal("WIA.DeviceEvent")
    @js.native
    class DeviceEvent protected ()
      extends typings.activexWia.WIA.DeviceEvent
    
    /**
      * The DeviceInfo object is a container that describes the unchanging (static) properties of an imaging device that is currently connected to the
      * computer.
      */
    @JSGlobal("WIA.DeviceInfo")
    @js.native
    class DeviceInfo protected ()
      extends typings.activexWia.WIA.DeviceInfo
    
    /**
      * The DeviceManager control is an invisible-at-runtime control that manages the imaging devices connected to the computer. A DeviceManager control can
      * be created using "WIA.DeviceManager" in a call to CreateObject or by dropping a DeviceManager on a form.
      */
    @JSGlobal("WIA.DeviceManager")
    @js.native
    class DeviceManager protected ()
      extends typings.activexWia.WIA.DeviceManager
    
    /**
      * The Filter object represents a unit of modification on an ImageFile. To use a Filter, add it to the Filters collection, then set the filter's
      * properties and finally use the Apply method of the ImageProcess object to filter an ImageFile.
      */
    @JSGlobal("WIA.Filter")
    @js.native
    class Filter protected ()
      extends typings.activexWia.WIA.Filter
    
    /**
      * The FilterInfo object is a container that describes a Filter object without requiring a Filter to be Added to the process chain. See the FilterInfos
      * property on the ImageProcess object for details on accessing FilterInfo objects.
      */
    @JSGlobal("WIA.FilterInfo")
    @js.native
    class FilterInfo protected ()
      extends typings.activexWia.WIA.FilterInfo
    
    /**
      * The ImageFile object is a container for images transferred to your computer when you call Transfer or ShowTransfer. It also supports image files
      * through LoadFile. An ImageFile object can be created using "WIA.ImageFile" in a call to CreateObject.
      */
    @JSGlobal("WIA.ImageFile")
    @js.native
    class ImageFile protected ()
      extends typings.activexWia.WIA.ImageFile
    
    /** The ImageProcess object manages the filter chain. An ImageProcess object can be created using "WIA.ImageProcess" in a call to CreateObject. */
    @JSGlobal("WIA.ImageProcess")
    @js.native
    class ImageProcess protected ()
      extends typings.activexWia.WIA.ImageProcess
    
    /**
      * The Item object is a container for an item on an imaging device object. See the Items property on the Device or Item object for details on accessing
      * Item objects.
      */
    @JSGlobal("WIA.Item")
    @js.native
    class Item protected ()
      extends typings.activexWia.WIA.Item
    
    /**
      * The Property object is a container for a property associated with a Device, DeviceInfo, Filter, ImageFile or Item object. See the Properties property
      * on any of these objects for details on accessing Property objects.
      */
    @JSGlobal("WIA.Property")
    @js.native
    class Property protected ()
      extends typings.activexWia.WIA.Property
    
    /**
      * The Rational object is a container for the rational values found in Exif tags. It is a supported element type of the Vector object and may be created
      * using "WIA.Rational" in a call to CreateObject.
      */
    @JSGlobal("WIA.Rational")
    @js.native
    class Rational protected ()
      extends typings.activexWia.WIA.Rational
  }
}
