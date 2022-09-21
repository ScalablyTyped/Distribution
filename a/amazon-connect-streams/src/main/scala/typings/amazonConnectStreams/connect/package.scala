package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.amazonConnectStreams.anon.Name
import typings.amazonConnectStreams.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * A callback to receive `Agent` API object instances.
  *
  * @param agent The `Agent` API object instance.
  */
type AgentCallback = js.Function1[/* agent */ Agent, Unit]

type AgentChannelConcurrencyMap = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{readonly [ channel in amazon-connect-streams.connect.ChannelType ]: number}
  */ typings.amazonConnectStreams.amazonConnectStreamsStrings.AgentChannelConcurrencyMap & TopLevel[Any]

/**
  * A callback to receive `AgentMutedStatus` API object instances.
  *
  * @param agentMutedStatus The `AgentMutedStatus` API object instance.
  */
type AgentMutedStatusCallback = js.Function1[/* agentMutedStatus */ AgentMutedStatus, Unit]

/**
  * A callback to receive an agent state change event.
  *
  * @param agentStateChange The agent state change event.
  */
type AgentStateChangeCallback = js.Function1[/* agentStateChange */ AgentStateChange, Unit]

type AppCreator = js.Function1[/* moduleData */ AppData, AppMethods]

type AttributeDictionary = StringDictionary[Name]

/**
  * A callback to receive `Contact` API object instances.
  *
  * @param contact A `Contact` API object instance.
  */
type ContactCallback = js.Function1[/* contact */ Contact, Unit]

type ReferenceDictionary = StringDictionary[Type]

/**
  * A callback to receive `SoftphoneError` errors.
  *
  * @param error A `SoftphoneError` error.
  */
type SoftphoneErrorCallback = js.Function1[/* error */ SoftphoneError, Unit]

/*
  * A callback to receive notifications of success or failure.
  */
type SuccessFailCallback[T /* <: js.Array[Any] */] = js.Function1[/* args */ T, Unit]

/**
  * A callback to receive 'UserMediaDeviceChange' API object instances
  *
  * @param userMediaDeviceChange The 'UserMediaDeviceChange' API object instance
  */
type UserMediaDeviceChangeCallback = js.Function1[/* userMediaDeviceChange */ UserMediaDeviceChange, Unit]

/**
  * A callback to receive `ViewContactEvent` objects.
  *
  * @param contact A `ViewContactEvent` object.
  */
type ViewContactCallback = js.Function1[/* contact */ ViewContactEvent, Unit]
