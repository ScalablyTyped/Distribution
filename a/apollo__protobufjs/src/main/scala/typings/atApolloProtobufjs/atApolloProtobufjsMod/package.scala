package typings.atApolloProtobufjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atApolloProtobufjsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atApolloProtobufjs.atApolloProtobufjsMod.rpc.ServiceMethod
  import typings.std.Error
  import typings.std.Uint8Array

  type Buffer = Uint8Array
  /**
    * Appends code to the function's body or finishes generation.
    * @param [formatStringOrScope] Format string or, to finish the function, an object of additional scope variables, if any
    * @param [formatParams] Format parameters
    * @returns Itself or the generated function if finished
    * @throws {Error} If format parameter counts do not match
    */
  type Codegen = js.Function2[
    /* formatStringOrScope */ js.UndefOr[String | StringDictionary[js.Any]], 
    /* repeated */ js.Any, 
    (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @apollo/protobufjs.@apollo/protobufjs.Codegen */ js.Object) | js.Function
  ]
  /**
    * Event listener as used by {@link util.EventEmitter}.
    * @param args Arguments
    */
  type EventEmitterListener = js.Function1[/* repeated */ js.Any, Unit]
  /**
    * Node-style callback as used by {@link util.fetch}.
    * @param error Error, if any, otherwise `null`
    * @param [contents] File contents, if there hasn't been an error
    */
  type FetchCallback = js.Function2[/* error */ Error, /* contents */ js.UndefOr[String], Unit]
  /**
    * Decorator function as returned by {@link Field.d} and {@link MapField.d} (TypeScript).
    * @param prototype Target prototype
    * @param fieldName Field name
    */
  type FieldDecorator = js.Function2[/* prototype */ js.Object, /* fieldName */ String, Unit]
  /**
    * A node-style callback as used by {@link load} and {@link Root#load}.
    * @param error Error, if any, otherwise `null`
    * @param [root] Root, if there hasn't been an error
    */
  type LoadCallback = js.Function2[/* error */ Error | Null, /* root */ js.UndefOr[Root], Unit]
  /**
    * Decorator function as returned by {@link OneOf.d} (TypeScript).
    * @param prototype Target prototype
    * @param oneofName OneOf name
    */
  type OneOfDecorator = js.Function2[/* prototype */ js.Object, /* oneofName */ String, Unit]
  /**
    * A OneOf getter as returned by {@link util.oneOfGetter}.
    * @returns Set field name, if any
    */
  type OneOfGetter = js.Function0[js.UndefOr[String]]
  /**
    * A OneOf setter as returned by {@link util.oneOfSetter}.
    * @param value Field name
    */
  type OneOfSetter = js.Function1[/* value */ js.UndefOr[String], Unit]
  /**
    * An allocator as used by {@link util.pool}.
    * @param size Buffer size
    * @returns Buffer
    */
  type PoolAllocator = js.Function1[/* size */ Double, Uint8Array]
  /**
    * A slicer as used by {@link util.pool}.
    * @param start Start offset
    * @param end End offset
    * @returns Buffer slice
    */
  type PoolSlicer = js.ThisFunction2[/* this */ Uint8Array, /* start */ Double, /* end */ Double, Uint8Array]
  /** Properties type. */
  type Properties[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typings.atApolloProtobufjs.atApolloProtobufjsStrings.Properties with T
  /**
    * RPC implementation passed to {@link Service#create} performing a service request on network level, i.e. by utilizing http requests or websockets.
    * @param method Reflected or static method being called
    * @param requestData Request data
    * @param callback Callback function
    */
  type RPCImpl = js.Function3[
    /* method */ Method | (ServiceMethod[Message[js.Object], Message[js.Object]]), 
    /* requestData */ Uint8Array, 
    /* callback */ RPCImplCallback, 
    Unit
  ]
  /**
    * Node-style callback as used by {@link RPCImpl}.
    * @param error Error, if any, otherwise `null`
    * @param [response] Response data or `null` to signal end of stream, if there hasn't been an error
    */
  type RPCImplCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Uint8Array | Null], Unit]
  /**
    * Gets the comment on the previous line or, alternatively, the line comment on the specified line.
    * @param [line] Line number
    * @returns Comment text or `null` if none
    */
  type TokenizerHandleCmnt = js.Function1[/* line */ js.UndefOr[Double], String | Null]
  /**
    * Gets the next token and advances.
    * @returns Next token or `null` on eof
    */
  type TokenizerHandleNext = js.Function0[String | Null]
  /**
    * Peeks for the next token.
    * @returns Next token or `null` on eof
    */
  type TokenizerHandlePeek = js.Function0[String | Null]
  /**
    * Pushes a token back to the stack.
    * @param token Token
    */
  type TokenizerHandlePush = js.Function1[/* token */ String, Unit]
  /**
    * Skips the next token.
    * @param expected Expected token
    * @param [optional=false] If optional
    * @returns Whether the token matched
    * @throws {Error} If the token didn't match and is not optional
    */
  type TokenizerHandleSkip = js.Function2[/* expected */ String, /* optional */ js.UndefOr[Boolean], Boolean]
  /**
    * Decorator function as returned by {@link Type.d} (TypeScript).
    * @param target Target constructor
    */
  type TypeDecorator[T /* <: Message[T] */] = js.Function1[/* target */ Constructor[T], Unit]
  /**
    * From object converter part of an {@link IWrapper}.
    * @param object Plain object
    * @returns Message instance
    */
  type WrapperFromObjectConverter = js.ThisFunction1[/* this */ Type, /* object */ StringDictionary[js.Any], Message[js.Object]]
  /**
    * To object converter part of an {@link IWrapper}.
    * @param message Message instance
    * @param [options] Conversion options
    * @returns Plain object
    */
  type WrapperToObjectConverter = js.ThisFunction2[
    /* this */ Type, 
    /* message */ Message[js.Object], 
    /* options */ js.UndefOr[IConversionOptions], 
    StringDictionary[js.Any]
  ]
  /**
    * Callback as used by {@link util.asPromise}.
    * @param error Error, if any
    * @param params Additional arguments
    */
  type asPromiseCallback = js.Function2[/* error */ Error | Null, /* repeated */ js.Any, Unit]
}
