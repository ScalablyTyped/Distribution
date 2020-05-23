package typings.activexWia

import typings.activexWia.WIA.WiaEventFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object WIA extends js.Object {
    /**
      * The CommonDialog control is an invisible-at-runtime control that contains all the methods that display a User Interface. A CommonDialog control can be
      * created using "WIA.CommonDialog" in a call to CreateObject or by dropping a CommonDialog on a form.
      */
    @js.native
    class CommonDialog protected ()
      extends typings.activexWia.WIA.CommonDialog
    
    /** The Device object represents an active connection to an imaging device. */
    @js.native
    class Device protected ()
      extends typings.activexWia.WIA.Device
    
    /** The DeviceCommand object describes a CommandID that can be used when calling ExecuteCommand on a Device or Item object. */
    @js.native
    class DeviceCommand protected ()
      extends typings.activexWia.WIA.DeviceCommand {
      /** Returns the commandID for this Command */
      /* CompleteClass */
      override val CommandID: String = js.native
      /** Returns the command Description */
      /* CompleteClass */
      override val Description: String = js.native
      /** Returns the command Name */
      /* CompleteClass */
      override val Name: String = js.native
      /* CompleteClass */
      @JSName("WIA.DeviceCommand_typekey")
      override var WIADotDeviceCommand_typekey: typings.activexWia.WIA.DeviceCommand = js.native
    }
    
    /** The DeviceEvent object describes an EventID that can be used when calling RegisterEvent or RegisterPersistentEvent on a DeviceManager object. */
    @js.native
    class DeviceEvent protected ()
      extends typings.activexWia.WIA.DeviceEvent {
      /** Returns the event Description */
      /* CompleteClass */
      override val Description: String = js.native
      /** Returns the EventID for this Event */
      /* CompleteClass */
      override val EventID: String = js.native
      /** Returns the event Name */
      /* CompleteClass */
      override val Name: String = js.native
      /** Returns the Type of this Event */
      /* CompleteClass */
      override val Type: WiaEventFlag = js.native
      /* CompleteClass */
      @JSName("WIA.DeviceEvent_typekey")
      override var WIADotDeviceEvent_typekey: typings.activexWia.WIA.DeviceEvent = js.native
    }
    
    /**
      * The DeviceInfo object is a container that describes the unchanging (static) properties of an imaging device that is currently connected to the
      * computer.
      */
    @js.native
    class DeviceInfo protected ()
      extends typings.activexWia.WIA.DeviceInfo
    
    /**
      * The DeviceManager control is an invisible-at-runtime control that manages the imaging devices connected to the computer. A DeviceManager control can
      * be created using "WIA.DeviceManager" in a call to CreateObject or by dropping a DeviceManager on a form.
      */
    @js.native
    class DeviceManager protected ()
      extends typings.activexWia.WIA.DeviceManager
    
    /**
      * The Filter object represents a unit of modification on an ImageFile. To use a Filter, add it to the Filters collection, then set the filter's
      * properties and finally use the Apply method of the ImageProcess object to filter an ImageFile.
      */
    @js.native
    class Filter protected ()
      extends typings.activexWia.WIA.Filter
    
    /**
      * The FilterInfo object is a container that describes a Filter object without requiring a Filter to be Added to the process chain. See the FilterInfos
      * property on the ImageProcess object for details on accessing FilterInfo objects.
      */
    @js.native
    class FilterInfo protected ()
      extends typings.activexWia.WIA.FilterInfo {
      /** Returns a technical Description of what the filter does and how to use it in a filter chain */
      /* CompleteClass */
      override val Description: String = js.native
      /** Returns the FilterID for this filter */
      /* CompleteClass */
      override val FilterID: String = js.native
      /** Returns the FilterInfo Name */
      /* CompleteClass */
      override val Name: String = js.native
      /* CompleteClass */
      @JSName("WIA.FilterInfo_typekey")
      override var WIADotFilterInfo_typekey: typings.activexWia.WIA.FilterInfo = js.native
    }
    
    /**
      * The ImageFile object is a container for images transferred to your computer when you call Transfer or ShowTransfer. It also supports image files
      * through LoadFile. An ImageFile object can be created using "WIA.ImageFile" in a call to CreateObject.
      */
    @js.native
    class ImageFile protected ()
      extends typings.activexWia.WIA.ImageFile
    
    /** The ImageProcess object manages the filter chain. An ImageProcess object can be created using "WIA.ImageProcess" in a call to CreateObject. */
    @js.native
    class ImageProcess protected ()
      extends typings.activexWia.WIA.ImageProcess
    
    /**
      * The Item object is a container for an item on an imaging device object. See the Items property on the Device or Item object for details on accessing
      * Item objects.
      */
    @js.native
    class Item protected ()
      extends typings.activexWia.WIA.Item
    
    /**
      * The Property object is a container for a property associated with a Device, DeviceInfo, Filter, ImageFile or Item object. See the Properties property
      * on any of these objects for details on accessing Property objects.
      */
    @js.native
    class Property protected ()
      extends typings.activexWia.WIA.Property
    
    /**
      * The Rational object is a container for the rational values found in Exif tags. It is a supported element type of the Vector object and may be created
      * using "WIA.Rational" in a call to CreateObject.
      */
    @js.native
    class Rational protected ()
      extends typings.activexWia.WIA.Rational {
      /** Returns/Sets the Rational Value Denominator */
      /* CompleteClass */
      override var Denominator: Double = js.native
      /** Returns/Sets the Rational Value Numerator */
      /* CompleteClass */
      override var Numerator: Double = js.native
      /** Returns the Rational Value as a Double */
      /* CompleteClass */
      override val Value: Double = js.native
      /* CompleteClass */
      @JSName("WIA.Rational_typekey")
      override var WIADotRational_typekey: typings.activexWia.WIA.Rational = js.native
    }
    
  }
  
}

