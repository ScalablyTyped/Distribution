package typings.apolloLink

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type FetchResult[TData, C, E] = typings.graphql.executeMod.ExecutionResult[TData] with (typings.apolloLink.AnonContext[E, C])
  type NextLink = js.Function1[
    /* operation */ typings.apolloLink.typesMod.Operation, 
    typings.zenObservableTs.zenObservableMod.Observable[
      typings.apolloLink.typesMod.FetchResult[
        org.scalablytyped.runtime.StringDictionary[js.Any], 
        typings.std.Record[java.lang.String, js.Any], 
        typings.std.Record[java.lang.String, js.Any]
      ]
    ]
  ]
  type RequestHandler = js.Function2[
    /* operation */ typings.apolloLink.typesMod.Operation, 
    /* forward */ typings.apolloLink.typesMod.NextLink, 
    (typings.zenObservableTs.zenObservableMod.Observable[
      typings.apolloLink.typesMod.FetchResult[
        org.scalablytyped.runtime.StringDictionary[js.Any], 
        typings.std.Record[java.lang.String, js.Any], 
        typings.std.Record[java.lang.String, js.Any]
      ]
    ]) | scala.Null
  ]
}
