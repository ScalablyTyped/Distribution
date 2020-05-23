package typings.algoliaClientCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ClientTransporterOptions = (typings.std.Pick[
    typings.algoliaTransporter.mod.TransporterOptions, 
    (typings.std.Exclude[
      typings.algoliaClientCommon.algoliaClientCommonStrings.hostsCache | typings.algoliaClientCommon.algoliaClientCommonStrings.logger | typings.algoliaClientCommon.algoliaClientCommonStrings.requester | typings.algoliaClientCommon.algoliaClientCommonStrings.requestsCache | typings.algoliaClientCommon.algoliaClientCommonStrings.responsesCache | typings.algoliaClientCommon.algoliaClientCommonStrings.timeouts | typings.algoliaClientCommon.algoliaClientCommonStrings.hosts | typings.algoliaClientCommon.algoliaClientCommonStrings.headers | typings.algoliaClientCommon.algoliaClientCommonStrings.queryParameters | typings.algoliaClientCommon.algoliaClientCommonStrings.userAgent, 
      typings.algoliaClientCommon.algoliaClientCommonStrings.headers
    ]) with (typings.std.Exclude[
      typings.algoliaClientCommon.algoliaClientCommonStrings.hostsCache | typings.algoliaClientCommon.algoliaClientCommonStrings.logger | typings.algoliaClientCommon.algoliaClientCommonStrings.requester | typings.algoliaClientCommon.algoliaClientCommonStrings.requestsCache | typings.algoliaClientCommon.algoliaClientCommonStrings.responsesCache | typings.algoliaClientCommon.algoliaClientCommonStrings.timeouts | typings.algoliaClientCommon.algoliaClientCommonStrings.hosts | typings.algoliaClientCommon.algoliaClientCommonStrings.headers | typings.algoliaClientCommon.algoliaClientCommonStrings.queryParameters | typings.algoliaClientCommon.algoliaClientCommonStrings.userAgent, 
      typings.algoliaClientCommon.algoliaClientCommonStrings.queryParameters
    ]) with (typings.std.Exclude[
      typings.algoliaClientCommon.algoliaClientCommonStrings.hostsCache | typings.algoliaClientCommon.algoliaClientCommonStrings.logger | typings.algoliaClientCommon.algoliaClientCommonStrings.requester | typings.algoliaClientCommon.algoliaClientCommonStrings.requestsCache | typings.algoliaClientCommon.algoliaClientCommonStrings.responsesCache | typings.algoliaClientCommon.algoliaClientCommonStrings.timeouts | typings.algoliaClientCommon.algoliaClientCommonStrings.hosts | typings.algoliaClientCommon.algoliaClientCommonStrings.headers | typings.algoliaClientCommon.algoliaClientCommonStrings.queryParameters | typings.algoliaClientCommon.algoliaClientCommonStrings.userAgent, 
      typings.algoliaClientCommon.algoliaClientCommonStrings.hosts
    ])
  ]) with typings.algoliaClientCommon.anon.Headers
  type CreateClient[TClient, TOptions] = js.Function1[
    /* options */ TOptions with (typings.algoliaClientCommon.anon.Methods[
      org.scalablytyped.runtime.StringDictionary[js.Function1[/* base */ TClient, js.Function1[/* args */ _, _]]], 
      TClient
    ]), 
    TClient with typings.algoliaClientCommon.algoliaClientCommonStrings.CreateClient with org.scalablytyped.runtime.TopLevel[js.Any]
  ]
  type Wait[TResponse] = js.Function2[
    /* response */ TResponse, 
    /* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
    typings.algoliaClientCommon.anon.ReadonlyPromiseany
  ]
}
